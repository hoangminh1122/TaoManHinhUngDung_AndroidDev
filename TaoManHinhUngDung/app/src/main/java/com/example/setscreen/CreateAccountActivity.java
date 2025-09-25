package com.example.setscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAccountActivity extends AppCompatActivity {

    // 1. Khai báo các biến
    EditText editTextFirstName, editTextLastName, editTextEmail, editTextPassword;
    Button buttonCreateAccount;
    TextView textViewGoToLogin; // Biến cho dòng chữ quay về

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        // 2. Ánh xạ các Widget
        editTextFirstName = findViewById(R.id.editTextFirstName);
        buttonCreateAccount = findViewById(R.id.buttonCreateAccount);
        textViewGoToLogin = findViewById(R.id.textViewGoToLogin); // Ánh xạ TextView

        // 3. Xử lý sự kiện nhấn nút "Create account"
        buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = editTextFirstName.getText().toString().trim();
                if (firstName.isEmpty()) {
                    Toast.makeText(CreateAccountActivity.this, "Vui lòng nhập tên", Toast.LENGTH_SHORT).show();
                } else {
                    // Gọi hàm để hiển thị hộp thoại
                    showSuccessDialog(firstName);
                }
            }
        });

        // 4. Xử lý sự kiện nhấn vào dòng chữ "Had account? Sign in"
        textViewGoToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quay về MainActivity
                finish(); // Lệnh này sẽ đóng màn hình hiện tại và quay về màn hình trước đó
            }
        });
    }

    // 5. Hàm để tạo và hiển thị hộp thoại (Alert Dialog)
    private void showSuccessDialog(String name) {
        new AlertDialog.Builder(this)
                .setTitle("Thông báo") // Tiêu đề của hộp thoại
                .setMessage("Xin chào " + name) // Nội dung thông báo
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Khi người dùng nhấn OK, quay về màn hình đăng nhập
                        finish();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_info) // Thêm icon cho đẹp
                .show();
    }
}