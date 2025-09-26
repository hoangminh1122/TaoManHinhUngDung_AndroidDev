package com.example.setscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class OrderFoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);

        Button btnConfirmOrder = findViewById(R.id.btnConfirmOrder);
        btnConfirmOrder.setOnClickListener(v -> {
            startActivity(new Intent(OrderFoodActivity.this, PaymentActivity.class));
        });
    }
}