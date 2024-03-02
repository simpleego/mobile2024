package com.simple.imageslide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageButton button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imagView);

        button1 = findViewById(R.id.imageButton1);
        button2 = findViewById(R.id.imageButton2);
    }
    public void setImage1(View view){
        imageView.setImageResource(R.drawable.pic);
    }

    public void setImage2(View view){
        imageView.setImageResource(R.drawable.pic2);
    }


}