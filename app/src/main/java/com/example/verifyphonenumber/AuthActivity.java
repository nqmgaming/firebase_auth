package com.example.verifyphonenumber;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AuthActivity extends AppCompatActivity {

    private LinearLayout btnSignUp;
    private LinearLayout btnPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_auth);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initUi();

        btnSignUp.setOnClickListener(v -> {
            intentToEmail();
        });
        btnPhone.setOnClickListener(v -> {
            intentToPhone();
        });
    }

    private void intentToPhone() {
        startActivity(new Intent(AuthActivity.this, PhoneActivity.class));
    }

    private void intentToEmail() {
        startActivity(new Intent(AuthActivity.this, SignUpActivity.class));
    }

    private void initUi() {
        btnSignUp = findViewById(R.id.linearLayout);
        btnPhone = findViewById(R.id.linearLayoutPhone);
    }
}