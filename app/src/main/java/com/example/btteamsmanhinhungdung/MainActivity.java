package com.example.btteamsmanhinhungdung;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    TextView tvCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin150);
        tvCreate = findViewById(R.id.tvLCreate150);

        btnLogin.setOnClickListener(v ->
                android.widget.Toast.makeText(MainActivity.this,
                        "Đăng nhập thành công (demoApp)",
                        android.widget.Toast.LENGTH_SHORT).show()
        );

        tvCreate.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SignupActivity.class);
            startActivity(intent);
        });
    }
}
