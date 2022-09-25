package com.example.famchapplicationconst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class FAMCH_Loading_Screen_Const extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famch_loading_screen_const);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(FAMCH_Loading_Screen_Const.this,MainActivity.class));
                finish();
            }
        },3000);
    }
}