package com.example.foodiappdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodiappdesign.databinding.ActivityDeskbordBinding;

public class DeskbordActivity extends AppCompatActivity {

    @NonNull ActivityDeskbordBinding deskbordbinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        deskbordbinding = ActivityDeskbordBinding.inflate(getLayoutInflater());
        setContentView(deskbordbinding.getRoot());






        deskbordbinding.pickUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i = new Intent(getApplicationContext(), BurgersActivity.class);
                startActivity(i);

            }
        });

        deskbordbinding.account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i = new Intent(getApplicationContext(), AccountActivity.class);
                startActivity(i);

            }
        });

        deskbordbinding.burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent b = new Intent(getApplicationContext(), BurgersActivity.class);
                startActivity(b);

            }
        });
        deskbordbinding.order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent b = new Intent(getApplicationContext(), ThankYouActivity.class);
                startActivity(b);

            }
        });

        deskbordbinding.pickboy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent p = new Intent(getApplicationContext(), BurgersActivity.class);
                startActivity(p);

            }
        });











    }
}