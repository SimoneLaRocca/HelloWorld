package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tvText;
    Random rg = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText = findViewById(R.id.tv);
    }

    public void cambiaColoreSfondo(View view) {
        int r = rg.nextInt(255)+1;
        int g = rg.nextInt(255)+1;
        int b = rg.nextInt(255)+1;
        tvText.setBackgroundColor(Color.rgb(r,g,b));
    }

    public void cambiaColoreTesto(View view) {
        int r = rg.nextInt(255)+1;
        int g = rg.nextInt(255)+1;
        int b = rg.nextInt(255)+1;
        tvText.setTextColor(Color.rgb(r,g,b));
    }
}