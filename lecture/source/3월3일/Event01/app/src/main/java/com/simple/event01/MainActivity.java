package com.simple.event01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        // 버튼 이벤트 등록
        button1.setOnClickListener(view -> changeClothingColor(Color.RED));
        button3.setOnClickListener(view -> setClothingColor());
        button4.setOnClickListener(view -> changeClothingColor(Color.GREEN));

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundColor(Color.YELLOW);
            }
        });
    }

    private void setClothingColor() {
        imageView.setBackgroundColor(Color.GRAY);
    }

    private void changeClothingColor(int color) {
        imageView.setBackgroundColor(color);
    }
}