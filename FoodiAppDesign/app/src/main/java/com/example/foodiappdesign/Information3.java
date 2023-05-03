package com.example.foodiappdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.foodiappdesign.databinding.ActivityInformation3Binding;

public class Information3 extends AppCompatActivity {

    ActivityInformation3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInformation3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnnext3.setOnClickListener(v ->{

            Intent i = new Intent(this,DeskbordActivity.class);
            startActivity(i);

        });



    }



}