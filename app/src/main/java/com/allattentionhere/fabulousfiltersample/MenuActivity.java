package com.allattentionhere.fabulousfiltersample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.allattentionhere.fabulousfilter.AAH_FabulousFragment;

import static com.allattentionhere.fabulousfiltersample.R.id.fab;

public class MenuActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.btn_bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this,MainActivity.class);
                i.putExtra("fab",1);
                startActivity(i);
            }
        });

        findViewById(R.id.btn_top).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this,MainActivity.class);
                i.putExtra("fab",2);
                startActivity(i);
            }
        });

        findViewById(R.id.btn_understanding).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this,MainSampleActivity.class);
                startActivity(i);
            }
        });
    }


}
