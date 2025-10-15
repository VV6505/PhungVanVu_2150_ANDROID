package com.example.baiktgk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editText, editPass;
    private Button btn_login150;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.ed_email150);
        editPass = findViewById(R.id.edpass_150);

        btn_login150.setOnClickListener(v -> {
            String email = editText.getText().toString().trim();
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("email",email);
            startActivity(intent);
        });
    }
}