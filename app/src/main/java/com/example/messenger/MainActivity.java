package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//nbmnb
public class MainActivity extends AppCompatActivity {
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextTextPersonName);

    }

    public void sendMsg(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String msg = editText.getText().toString();
        intent.putExtra("msg", msg);
        startActivity(intent);
    }

}