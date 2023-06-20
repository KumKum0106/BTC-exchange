package com.example.btcexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class CreateAccount extends AppCompatActivity {
    TextView txt1;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        btn = findViewById(R.id.sign);
        txt1 = findViewById(R.id.signin);
        EditText account = (EditText) findViewById(R.id.accbutton);
        EditText email = (EditText) findViewById(R.id.emailbutton);
        EditText password = (EditText) findViewById(R.id.passbutton);
        EditText repass = (EditText) findViewById(R.id.repassbutton);

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MoveToActivityUsingTextView2();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(account.getText().toString().isEmpty() || email.getText().toString().isEmpty()|| password.getText().toString().isEmpty() || repass.getText().toString().isEmpty()){
                    Toast.makeText(CreateAccount.this, "Enter the data", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(CreateAccount.this, "Account - " +account.getText().toString() + "\n" + "Email - " +email.getText().toString() + "\n" + "Password - " +password.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });

    }


    public void MoveToActivityUsingTextView2(){
        Intent intent = new Intent(CreateAccount.this, Sign_In.class);
        startActivity(intent);
    }
}