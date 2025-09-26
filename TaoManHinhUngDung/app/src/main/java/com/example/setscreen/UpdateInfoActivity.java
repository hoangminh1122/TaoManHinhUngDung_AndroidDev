package com.example.setscreen;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class UpdateInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_info);

        Button btnExit = findViewById(R.id.btnExit);
        Button btnConfirmUpdate = findViewById(R.id.btnConfirmUpdate);

        btnExit.setOnClickListener(v -> {
            showInfoDialog("Bạn có chắc muốn thoát?", "Mọi thay đổi sẽ không được lưu.");
        });

        btnConfirmUpdate.setOnClickListener(v -> {
            showInfoDialog("Thành công", "Thông tin của bạn đã được cập nhật.");
        });
    }

    private void showInfoDialog(String title, String message) {
        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", (dialog, which) -> finish()) // Nhấn OK sẽ đóng màn hình
                .show();
    }
}