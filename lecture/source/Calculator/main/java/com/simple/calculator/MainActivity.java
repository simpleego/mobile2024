package com.simple.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 필요한 재료준비(멤버구성) 구성요소
    EditText edit1, edit2; // 입력값을 위한 객체
    Button btn_add,btn_sub,btn_mul,btn_div;// 버튼 처리를 위한 객체

    TextView text_Result;  // 결과출력 객체

    // 내부적인 처리를 위한 변수
    Integer result;
    String num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 입력 컴포넌트를 변수로 연결(바인딩)
        edit1 = findViewById(R.id.Edit1);
        edit2 = findViewById(R.id.Edit2);

        btn_add = findViewById(R.id.btn_add);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mul = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);

        text_Result = findViewById(R.id.txtResult);

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                // 정수로 변환 후 덧셈
                if(Integer.parseInt(num2) != 0){
                    double  result = (double)Integer.parseInt(num1) / Integer.parseInt(num2);
                    String result1 = String.format("%6.4f",result);
                    text_Result.setText("계산결과 : " + result1);
                }else {
                    text_Result.setText("0으로 나눌 수 없습니다.");
                }
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                // 정수로 변환 후 덧셈
                result = Integer.parseInt(num1) * Integer.parseInt(num2);

                text_Result.setText("계산결과 : " + result);
            }
        });


        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                // 정수로 변환 후 덧셈
                result = Integer.parseInt(num1) - Integer.parseInt(num2);

                text_Result.setText("계산결과 : " + result);
            }
        });

        // 이벤트 등록,  이벤트 처리(+)
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 덧셈처리
                // 1. 숫자2개의 값을 가져와서 정수로 변환
                // 2. 덧셈을 처리
                // 3. 처리된 결과를 화면 출력
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                // 정수로 변환 후 덧셈
                result = Integer.parseInt(num1) + Integer.parseInt(num2);

                text_Result.setText("계산결과 : " + result);
            }
        });

    }
}