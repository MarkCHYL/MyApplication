package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Mark on 2017/11/7.
 */

public class Test01 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_slide);
        overridePendingTransition(R.anim.activity_in,R.anim.activity_out);
    }

    public  void  doNext(View view){
        startActivity(new Intent(Test01.this,Test02.class));
    }
}
