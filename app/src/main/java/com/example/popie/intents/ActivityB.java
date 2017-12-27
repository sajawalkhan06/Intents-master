package com.example.popie.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        TextView tV = (TextView) findViewById(R.id.textViewMsg);

        Intent intent = getIntent();

        String msg = intent.getStringExtra("key");

        tV.setText(msg);
    }

    public void onClick(View view){

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
