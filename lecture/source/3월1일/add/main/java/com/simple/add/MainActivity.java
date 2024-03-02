package com.simple.add;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 멤버선언(준비)
    EditText edit1, edit2, edit3;
    Button  btn_add;
    String num1;
    String num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 가져오기(입력)
        // 화면과 프로그램을 연결(바인딩)
        edit1 = findViewById(R.id.num1);
        edit2 = findViewById(R.id.num2);
        edit3 = findViewById(R.id.result);
        btn_add = findViewById(R.id.add);


        // 이벤트 처리
        // 1. 이벤트 등록, 이벤트 처리 메서드 작성(이벤트 핸들 작성)
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 사용자가 입력 숫자를 가져오기
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                toast.show();
                // 2개의 숫자를 덧셈한다.
                int result = Integer.parseInt(num1)+ Integer.parseInt(num2);

                // 데이터 출력
                edit3.setText(result);// 출력화면에 값을 출력
            }
        });

    }
}