package com.example.drlocator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutUs extends AppCompatActivity {

    CardView cardView1, cardView2, cardView3, cardView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        cardView1 = findViewById(R.id.Syakir);
        cardView2 = findViewById(R.id.Sarah);
        cardView3 = findViewById(R.id.Arif);
        cardView4 = findViewById(R.id.Wana);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Syakir.class);
                startActivity(intent);
                finish();
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Sarah.class);
                startActivity(intent);
                finish();
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Arif.class);
                startActivity(intent);
                finish();
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Wana.class);
                startActivity(intent);
                finish();
            }
        });

    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }
}