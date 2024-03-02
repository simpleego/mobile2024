package com.simple.textviewcode;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 멤버 선언(데이터 준비)
    TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // XML요소와 화면요소를 연결(바인딩)
        txt1 = findViewById(R.id.text1);
        txt2 = findViewById(R.id.text2);
        txt3 = findViewById(R.id.text3);

        txt1.setText("자바 코드로 글자를 변경");
        txt2.setTextSize(60);
        txt3.setTextSize(60);
        txt3.setAllCaps(true);
        txt3.setTypeface(Typeface.SERIF, Typeface.ITALIC);


    }
}