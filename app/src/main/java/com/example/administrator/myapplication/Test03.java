package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mark on 2017/11/7.
 */

public class Test03 extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_slide);
        overridePendingTransition(R.anim.activity_in,R.anim.activity_out);
    }

    public  void  doNext(View view){
        startActivity(new Intent(this,Test04.class));
    }
}
