package com.simple.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // 데이터, 객체 (도구)
    EditText editNum1;
    EditText editNum2;
    EditText editResult;

    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 화면 생성 이후 해야할 작업을 기술

        // 화면에 입력한 값을 가져올 수 있도록 처리(바인딩)
        editNum1 = findViewById(R.id.editNum1);
        editNum2 = findViewById(R.id.editNum2);
        editResult = findViewById(R.id.editResult);

        Button btnAdd = findViewById(R.id.buttonAdd);
    }

    private void load_convert(){
        // 2개의 숫자 가져오기
        String num1_ = editNum1.getText().toString();
        String num2_ = editNum2.getText().toString();

        // 2개의 숫자를 숫자로 변환
        int num1 = Integer.parseInt(num1_);
        int num2 = Integer.parseInt(num2_);
        // 2개의 숫자를 덧셈
    }

    public void cal_add(View view){
        load_convert();
        int result = num1 + num2;

        // 덧셈결과를 화면에 출력
        editResult.setText("결과 : " +result);
    }

    public void cal_sub(View view){
        load_convert();
        // 2개의 숫자를 덧셈
        int result = num1 - num2;

        // 덧셈결과를 화면에 출력
        editResult.setText("결과 : " +result);
    }

    public void cal_mul(View view){
        load_convert();
        int result = num1 * num2;

        // 덧셈결과를 화면에 출력
        editResult.setText("결과 : " +result);
    }

    public void cal_div(View view){
        load_convert();
        double result=0.0;
        // 2개의 숫자를 나눗셈
        if(num2 != 0 ){
            result = (double) num1 / num2;
            // 덧셈결과를 화면에 출력
            String result_ = String.format("%6.2f",result);
            editResult.setText("결과 : " +result_);
        } else {
            editResult.setText("결과 : 0으로 나눌 수 없습니다");
        }

    }


}