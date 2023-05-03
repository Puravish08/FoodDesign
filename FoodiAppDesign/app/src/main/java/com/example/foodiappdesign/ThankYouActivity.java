package com.example.foodiappdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodiappdesign.databinding.ActivityThankYouBinding;

public class ThankYouActivity extends AppCompatActivity {

    ActivityThankYouBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThankYouBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),DeskbordActivity.class);
                startActivity(i);

            }
        });
           binding.mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),DeskbordActivity.class);
                startActivity(i);

            }
        });



    }







}