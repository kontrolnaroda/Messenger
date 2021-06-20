package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView textViewMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewMsg = findViewById(R.id.textView);
        Intent intent = getIntent();
       String msg = intent.getStringExtra("msg");
       textViewMsg.setText(msg);


    }
}