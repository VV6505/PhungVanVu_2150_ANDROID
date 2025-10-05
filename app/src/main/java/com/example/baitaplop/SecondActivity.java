package com.example.baitaplop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView txtProfileName150, back150;
    private EditText etEmail150, etFullName150, etMsv150, etPhone150;
    private ImageView imvSetting150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);// gắn giao diện activity second

        txtProfileName150 = findViewById(R.id.txt_Profile_150);
        back150 = findViewById(R.id.back_150);// Back quay lại
        imvSetting150 = findViewById(R.id.imvsetting_150);// Setting quay lại

        // Các ô thông tin chi tiết
        etEmail150 = findViewById(R.id.etEmail150);
        etFullName150 = findViewById(R.id.etFullName150);
        etMsv150 = findViewById(R.id.etMsv150);
        etPhone150 = findViewById(R.id.etPhone150);

        // Lấy dữ liệu từ Intent
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String fullname = intent.getStringExtra("fullname");
        String codestudent = intent.getStringExtra("codestudent");
        String phone = intent.getStringExtra("phone");

        etEmail150.setText(email != null ? email : "");

        // Khi có fullname (là email = phungvu65005@gmail.com)
        if (fullname != null && !fullname.isEmpty()) {
            // Hiển thị tên đầy đủ vào Profile Name
            txtProfileName150.setText(fullname);
            etFullName150.setText(fullname);
            etMsv150.setText(codestudent);
            etPhone150.setText(phone);
        } else {
            // Lấy phần trước @ của email để hiển thị
            String profileName = "";
            if (email != null && email.contains("@")) {
                profileName = email.substring(0, email.indexOf("@"));
            }
            txtProfileName150.setText(profileName);
            etFullName150.setText("");
            etMsv150.setText("");
            etPhone150.setText("");
        }

        // Nút setting quay lại Login
        imvSetting150.setOnClickListener(v -> {
            Intent i = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        });

        // Nút Back quay lại Login
        back150.setOnClickListener(v -> {
            Intent i = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        });
    }
}
