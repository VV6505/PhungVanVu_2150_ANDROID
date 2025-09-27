package com.example.btteamsmanhinhungdung;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    Button btnBack, btnSignup;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_createacc);

        btnBack = findViewById(R.id.btnBack);
        btnSignup = findViewById(R.id.btnCreate150);
        tvLogin = findViewById(R.id.tvLLogin150);

        btnBack.setOnClickListener(v -> finish());

        btnSignup.setOnClickListener(v -> {
            Toast.makeText(this,
                    "Tài khoản đã được tạo thành công (demoApp)",
                    Toast.LENGTH_SHORT).show();
            finish();
        });

        tvLogin.setOnClickListener(v -> finish());
    }
}
