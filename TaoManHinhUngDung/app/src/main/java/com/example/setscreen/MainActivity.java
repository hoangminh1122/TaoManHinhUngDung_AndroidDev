package com.example.setscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonGoToCreateAccount;
    Button buttonSignIn; // Khai báo nút Sign In

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các nút
        buttonGoToCreateAccount = findViewById(R.id.buttonGoToCreateAccount);
        buttonSignIn = findViewById(R.id.buttonSignIn); // Ánh xạ nút Sign In

        // Sự kiện chuyển sang màn hình Create Account
        buttonGoToCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });

        // Sự kiện cho nút Sign In
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mở HomeActivity
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}