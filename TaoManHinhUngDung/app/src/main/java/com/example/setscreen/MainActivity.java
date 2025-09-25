package com.example.setscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 1. Khai báo biến cho nút bấm
    Button buttonGoToCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. Ánh xạ (kết nối) biến với nút bấm trong XML qua ID
        buttonGoToCreateAccount = findViewById(R.id.buttonGoToCreateAccount);

        // 3. Gán sự kiện click cho nút
        buttonGoToCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi nút được nhấn, tạo một Intent để mở màn hình CreateAccountActivity
                Intent intent = new Intent(MainActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });
    }
}