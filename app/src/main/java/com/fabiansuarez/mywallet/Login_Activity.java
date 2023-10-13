package com.fabiansuarez.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity {

    private TextView tvGoRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvGoRegister =findViewById(R.id.tv_go_register);

        tvGoRegister.setOnClickListener(view -> {
            Intent goRegister = new Intent(Login_Activity.this, Register_Activity.class);
            startActivity(goRegister);
            finish();
        });
    }
}