package com.example.btcexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_In extends AppCompatActivity {
    TextView txt;
    EditText acc, mail;
    Button btn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        txt = findViewById(R.id.signup);
        acc = findViewById(R.id.sin);
        mail = findViewById(R.id.sin2);
        btn1 = findViewById(R.id.butt1);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MoveToActivityUsingTextView1();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(acc.getText().toString().isEmpty() || mail.getText().toString().isEmpty()){
                    Toast.makeText(Sign_In.this, "Enter the data", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Sign_In.this, "Account - " +acc.getText().toString() + "\n" + "Email - " +mail.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void MoveToActivityUsingTextView1(){
        Intent intent = new Intent(Sign_In.this, CreateAccount.class);
        startActivity(intent);
    }
}