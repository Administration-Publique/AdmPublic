package com.example.admpublic;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Pass;
    private TextView ToGoRegister;
    private Button LogGoogle;
    private Button Logface;
    private TextView Help;
    private Button Login;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText)findViewById(R.id.emailOrUser);
        Pass = (EditText)findViewById(R.id.pass);
        ToGoRegister = (TextView) findViewById(R.id.signup);
        Help = (TextView) findViewById(R.id.forgotpass);
        Login = (Button) findViewById(R.id.connectBtn);
        Logface = (Button) findViewById(R.id.connectFace);
        LogGoogle = (Button) findViewById(R.id.connectGoogle);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validate(Name.getText().toString(), Pass.getText().toString());

            }
        });
    }

    private void validate (String userName, String userPassword  ){
       if ( (userName.equals( "Admin")) && (userPassword.equals("12345"))){
           Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
       }
    }
}
