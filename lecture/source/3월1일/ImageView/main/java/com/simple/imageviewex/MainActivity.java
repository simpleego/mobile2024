package com.simple.imageviewex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private int scaleTypeIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
    }

    public void changeScaleType(View view){
        ImageView.ScaleType[] scaleTypes = {
                ImageView.ScaleType.CENTER,
                ImageView.ScaleType.CENTER_CROP,
                ImageView.ScaleType.CENTER_INSIDE,
                ImageView.ScaleType.FIT_CENTER,
                ImageView.ScaleType.FIT_XY
        };

        imageView.setScaleType(scaleTypes[scaleTypeIndex]);
        //imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        scaleTypeIndex = (scaleTypeIndex + 1) % scaleTypes.length;
    }

    public void changeRotation(View view){
        float deg = imageView.getRotation()+10;
        imageView.setRotation(deg);
    }

    public void changeAlpha(View view){
        float alpha = imageView.getAlpha();
        alpha = (alpha == 1.0f)? 0.5f : 1.0f;
        imageView.setAlpha(alpha);
    }

}