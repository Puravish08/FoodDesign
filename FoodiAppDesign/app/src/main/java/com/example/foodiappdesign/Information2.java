package com.example.foodiappdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Information2 extends AppCompatActivity {

 AppCompatButton information2;
 TextView skipme;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information2);


        initView();
    }

    private void initView() {


        information2 = findViewById(R.id.btnnext2);
        skipme = findViewById(R.id.skip2);



        information2.setOnClickListener( v -> {


            Intent i = new Intent(this,Information3.class);
            startActivity(i);


        });


        skipme.setOnClickListener( v -> {


            Intent i = new Intent(this,DeskbordActivity.class);
            startActivity(i);


        });



    }
}