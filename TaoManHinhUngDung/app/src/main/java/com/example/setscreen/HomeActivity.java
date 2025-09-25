package com.example.setscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnOrderFood, btnUpdateInfo, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Ánh xạ
        btnOrderFood = findViewById(R.id.btnOrderFood);
        btnUpdateInfo = findViewById(R.id.btnUpdateInfo);
        btnLogout = findViewById(R.id.btnLogout);

        // Sự kiện cho nút Đặt món ăn
        btnOrderFood.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, OrderFoodActivity.class));
        });

        // Sự kiện cho nút Cập nhật thông tin
        btnUpdateInfo.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, UpdateInfoActivity.class));
        });

        // Sự kiện cho nút Đăng xuất
        btnLogout.setOnClickListener(v -> {
            // Tạo Intent để quay về màn hình đăng nhập (MainActivity)
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            // Các flag này giúp xóa tất cả các màn hình trước đó và tạo một task mới
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        });
    }
}