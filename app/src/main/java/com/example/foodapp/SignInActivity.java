package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class SignInActivity extends AppCompatActivity {
    Button bt;
    TextView tv,tvforgot;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sign_in_activity);
    bt = (Button) findViewById(R.id.bt_signin);
    tv = (TextView) findViewById(R.id.tv_signup);
    tvforgot =(TextView) findViewById(R.id.tv_forgotpass);
    tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
            startActivity(intent);
        }
    });
    tvforgot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(SignInActivity.this, ForgotPassActivity.class);
            startActivity(intent);
        }
    });
    }
}
