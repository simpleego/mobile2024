package com.simple.checkboxex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img1, img2;

    CheckBox chkBox1, chkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.image1);
        img2 = findViewById(R.id.image2);

        chkBox1 = findViewById(R.id.check1);
        chkBox2 = findViewById(R.id.check2);

        chkBox1.setOnClickListener(view->checkBoxProcess(view));

//        chkBox1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // 원하는 체크박스 기능을 구현
//                boolean checked = ((CheckBox) v).isChecked();
//                if(checked) {
//                    img1.setImageResource(R.drawable.sand1);
//                }else {
//                    img1.setImageResource(0);
//                }
//            }
//        });

        chkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 원하는 체크박스 기능을 구현
                boolean checked = ((CheckBox) v).isChecked();
                if(checked) {
                    img2.setImageResource(R.drawable.sand2);
                }else {
                    img2.setImageResource(0);
                }
            }
        });

    }

    private void checkBoxProcess(View v) {
        boolean checked = ((CheckBox) v).isChecked();
        if(checked) {
            img1.setImageResource(R.drawable.sand1);
        }else {
            img1.setImageResource(0);
        }

    }
}