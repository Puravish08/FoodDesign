package com.example.foodiappdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodiappdesign.databinding.ActivityBurgersBinding;

public class BurgersActivity extends AppCompatActivity {

    ActivityBurgersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBurgersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent b = new Intent(getApplicationContext(), ThankYouActivity.class);
                startActivity(b);

            }
        });


        binding.account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i = new Intent(getApplicationContext(), AccountActivity.class);
                startActivity(i);

            }
        });
        binding.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i = new Intent(getApplicationContext(), DeskbordActivity.class);
                startActivity(i);

            }
        });

        binding.burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent b = new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(b);

            }
        });
    }
}