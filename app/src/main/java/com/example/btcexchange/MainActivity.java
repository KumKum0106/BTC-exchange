package com.example.btcexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.Button1);
        txt = findViewById(R.id.text1);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MoveToActivityUsingTextView();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MoveToActivityUsingButton();
            }

        });
    }

    public void MoveToActivityUsingTextView(){
        Intent intent = new Intent(MainActivity.this, Sign_In.class);
        startActivity(intent);
    }

    public void MoveToActivityUsingButton() {
        Intent intent = new Intent(MainActivity.this, CreateAccount.class);
        startActivity(intent);
    }
}