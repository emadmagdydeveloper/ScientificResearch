package com.semicolon.scientificresearch.Activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.semicolon.scientificresearch.EventListener.Events;
import com.semicolon.scientificresearch.R;
import com.semicolon.scientificresearch.databinding.ActivityTranslateBinding;

import me.anwarshahriar.calligrapher.Calligrapher;

public class TranslateActivity extends AppCompatActivity implements Events{

    private ActivityTranslateBinding translateBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        translateBinding = DataBindingUtil.setContentView(this,R.layout.activity_translate);
        Calligrapher calligrapher=new Calligrapher(this);
        calligrapher.setFont(this,"JannaLT-Regular.ttf",true);
        translateBinding.setEvent(this);
    }

    @Override
    public void onClickListener(View view) {
        int id = view.getId();
        switch (id)
        {
            case R.id.freeTransBtn:
                Intent intent = new Intent(TranslateActivity.this,FreeTranslation.class);
                startActivity(intent);
                break;
            case R.id.paidTransBtn:
                Intent intent1 = new Intent(TranslateActivity.this,TadqeqActivity.class);
                startActivity(intent1);
                break;
            case R.id.back:
                finish();
                break;
        }
    }
}
