package com.simple.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView, userInf;
    private EditText editId, editPassword, editPhone, editEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text1);
        userInf = findViewById(R.id.userInfo);

        editId = findViewById(R.id.editid);
        editPassword = findViewById(R.id.editpassword);
        editPhone = findViewById(R.id.editPhone);
        editEmail = findViewById(R.id.editEmail);
    }

    public void regMember(View view){
        // 회원정보 출력
        // 위젯에서 입력된 값을 가져오기
        String Id = editId.getText().toString();
        String password = editPassword.getText().toString();
        String phone = editPhone.getText().toString();
        String email = editEmail.getText().toString();

        // 처리(회원정보를 가져오기, 회원정보 하나의 값으로 묶기)
        String userInfo = Id+"\n"+password+"\n"+phone+"\n"+email;

        // 출력 위젯 회원정보를 출력
        userInf.setText(userInfo);
    }
}