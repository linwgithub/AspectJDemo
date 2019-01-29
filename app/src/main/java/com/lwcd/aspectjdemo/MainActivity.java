package com.lwcd.aspectjdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_btn_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击事件two", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void myClick(View view) {
        Toast.makeText(this, "点击事件", Toast.LENGTH_SHORT).show();
    }
}
