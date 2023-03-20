package com.example.ola;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View mainLayout = findViewById(R.id.main_layout);
        View colorButton = findViewById(R.id.color_button);

        colorButton.setOnClickListener(v -> {
            int newColor = generateRandomColor();
            mainLayout.setBackgroundColor(newColor);
        });
        }

        private int generateRandomColor() {
            Random random = new Random();
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            return Color.rgb(red, green, blue);
        }
    }
