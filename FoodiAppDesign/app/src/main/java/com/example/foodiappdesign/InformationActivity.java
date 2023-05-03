package com.example.foodiappdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodiappdesign.databinding.ActivityInformationBinding;


public class InformationActivity extends AppCompatActivity {


ActivityInformationBinding informationBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        informationBinding = ActivityInformationBinding.inflate(getLayoutInflater());
        setContentView(informationBinding.getRoot());


        information1();

    }


    private void information1() {


        informationBinding.btninformation1.setOnClickListener(v -> {

            Intent i = new Intent(getApplicationContext(), Information2.class);
            startActivity(i);


        });


        informationBinding.skip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getApplicationContext(), DeskbordActivity.class);
                startActivity(i);


            }
        });

    }









}