package com.simple.layoutframeex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.simple.layoutframeex.R;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3;

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.view1);
        tv2 = (TextView) findViewById(R.id.view2);
        tv3 = (TextView) findViewById(R.id.view3);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);

    }

    public void onClick(View view) {
        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        int id = view.getId();
        if (id == R.id.button1) {
            tv1.setVisibility(View.VISIBLE);
        } else if (id == R.id.button2) {
            tv2.setVisibility(View.VISIBLE);
        } else if (id == R.id.button3) {
            tv3.setVisibility(View.VISIBLE);
        }
    }
}