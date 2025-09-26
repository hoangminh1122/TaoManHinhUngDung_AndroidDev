package com.example.setscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Button btnPay = findViewById(R.id.btnPay);
        btnPay.setOnClickListener(v -> showSuccessDialog());
    }

    private void showSuccessDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Thanh toán thành công")
                .setMessage("Cảm ơn bạn đã sử dụng dịch vụ!")
                .setPositiveButton("OK", (dialog, which) -> {
                    // Chuyển sang màn hình lựa chọn
                    startActivity(new Intent(PaymentActivity.this, PostPaymentChoiceActivity.class));
                    finish(); // Đóng màn hình thanh toán
                })
                .setIcon(android.R.drawable.checkbox_on_background) // Icon tích xanh
                .show();
    }
}