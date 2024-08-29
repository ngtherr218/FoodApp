package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NewPassActivity extends AppCompatActivity {
    Button bt;
    ImageButton ib;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_pass_activity);
        bt =(Button) findViewById(R.id.bt_confirm);
        ib = (ImageButton) findViewById(R.id.ib_back);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewPassActivity.this,SignInActivity.class);
                startActivity(intent);
                Toast.makeText(NewPassActivity.this,"Sign in your account.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
