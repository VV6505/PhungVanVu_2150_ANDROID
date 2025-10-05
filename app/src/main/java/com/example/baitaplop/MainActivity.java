package com.example.baitaplop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    private EditText etEmail150, etPassword150;
    private Button btnLogin150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// Gắn giao diện activity main

        etEmail150 = findViewById(R.id.etEmail150);
        etPassword150 = findViewById(R.id.etPassword150);
        btnLogin150 = findViewById(R.id.btnLogin150);

        btnLogin150.setOnClickListener(v -> {
            String email = etEmail150.getText().toString().trim();

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("email", email);

            // Nếu email đúng thì truyền thêm dữ liệu
            if (email.equalsIgnoreCase("phungvu65005@gmail.com")) {
                intent.putExtra("fullname", "Phung Van Vu");
                intent.putExtra("codestudent", "23115053122150");
                intent.putExtra("phone", "+84 768528480");
            }

            startActivity(intent);
        });
    }
}