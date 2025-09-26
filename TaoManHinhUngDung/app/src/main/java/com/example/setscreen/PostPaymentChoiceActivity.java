package com.example.setscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PostPaymentChoiceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_payment_choice);

        Button btnGoToHome = findViewById(R.id.btnGoToHome);
        Button btnBackToOrder = findViewById(R.id.btnBackToOrder);

        btnGoToHome.setOnClickListener(v -> {
            Intent intent = new Intent(this, HomeActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Xóa các màn hình ở giữa
            startActivity(intent);
        });

        btnBackToOrder.setOnClickListener(v -> {
            Intent intent = new Intent(this, OrderFoodActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}