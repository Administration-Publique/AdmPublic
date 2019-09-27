package com.example.admpublic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    private TextView Conditions;
    private TextView Help;
    private Button Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Conditions = (TextView) findViewById(R.id.conditions);
        Help = (TextView) findViewById(R.id.help);
        Start = (Button) findViewById(R.id.startBtn);

        Start.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, LoginActivity.class);
                StartActivity.this.startActivity(intent);

            }
        });
    }
}
