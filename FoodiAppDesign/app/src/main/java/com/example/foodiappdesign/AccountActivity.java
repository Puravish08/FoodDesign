package com.example.foodiappdesign;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.foodiappdesign.databinding.ActivityAccountBinding;

public class AccountActivity extends AppCompatActivity {

    ActivityAccountBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAccountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        binding.home.setBackgroundColor(Color.parseColor("#80000000"));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {

            Window window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.unknow));

        }


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



                Intent b = new Intent(getApplicationContext(), DeskbordActivity.class);
                startActivity(b);

            }
        });

        binding.pickboy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent p = new Intent(getApplicationContext(), BurgersActivity.class);
                startActivity(p);

            }
        });



    }







}