package com.example.popie.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

        Intent intent = new Intent(this,ActivityB.class);

        EditText msgA = (EditText) findViewById(R.id.MsgtoB);
        String msgtoB = msgA.getText().toString();
        intent.putExtra("key", msgtoB);

        startActivity(intent);

    }
}
