package com.simple.layoutcodeex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout container = new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);

        button1 = new Button(this);
        button2 = new Button(this);

        button1.setText("첫 번째 버튼");
        button2.setText("두 번째 버튼");

        // 버튼을 무대에 캐스팅
        container.addView(button1);
        container.addView(button2);

        setContentView(container);


    }

}