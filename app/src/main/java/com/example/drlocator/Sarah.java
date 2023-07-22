package com.example.drlocator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.webkit.WebView;

import android.os.Bundle;

public class Sarah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarah);

        WebView webViewer = (WebView) findViewById(R.id.web);
        webViewer.loadUrl("file:///android_asset/www/sarah.html");
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), AboutUs.class);
        startActivity(intent);
        finish();
    }
}