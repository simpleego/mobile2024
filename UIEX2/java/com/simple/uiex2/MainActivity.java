package com.simple.uiex2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    private EditText text, textResult;
    private ImageView bulbImageView;
    private Switch switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
        text = findViewById(R.id.editText);
        textResult = findViewById(R.id.editResult);
        bulbImageView = findViewById(R.id.bulbImageView);
        switchButton = findViewById(R.id.switchButton);

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // 스위치 상태에 따른 기능을 구현
                if(isChecked){
                    bulbImageView.setImageResource(R.drawable.on);
                }else {
                    bulbImageView.setImageResource(R.drawable.off);
                }
            }
        });

    }

    public void onClicked(View view){
        //  변환버튼이 클릭되면
        //  섭씨<-> 변환작업을 수행
        //  섭씨, 화씨 변환 상태에 따라서 수행
        RadioButton celsiusButton = findViewById(R.id.radioButtonC);
        RadioButton fahrenheitButton = findViewById(R.id.radioButtonF);

        // 입력 불가능(출력용으로 설정)
        textResult.setEnabled(false);

        //  변환할 온도값을 가져오기
        if(text.getText().length() == 0){
            Toast.makeText(this,"정확한 값을 입력하시오.", Toast.LENGTH_LONG).show();
            return;
        }

        // 1. 온도값을 변수로 가져오기
        float inputValue = Float.parseFloat(text.getText().toString());

        // 2. 화씨/섭씨 여부를 선택
        if(celsiusButton.isChecked()){
            // 화씨를 섭씨로 변환
            float temp_c = convertFahrenheitToCelisus(inputValue);
            textResult.setText(String.valueOf(temp_c));
            //text.setText(""+temp_c);
        }else {
            // 섭씨를 화씨로 변환
            float temp_c = convertCelisusToFahrenheit(inputValue);
            textResult.setText(String.valueOf(temp_c));
        }

    }

    private float convertCelisusToFahrenheit(float celisus) {
        return ((celisus * 9) / 5) + 32;
    }

    private float convertFahrenheitToCelisus(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    public void onRadioButtonClicked(View view) {
        boolean checkd = ((RadioButton) view).isChecked();

        if (view.getId() == R.id.radio_red) {
            if (checkd)
                layout.setBackgroundColor(Color.RED);
        }

        if (view.getId() == R.id.radio_blue) {
            if (checkd)
                layout.setBackgroundColor(Color.BLUE);
        }

        if (view.getId() == R.id.radio_yellow) {
            if (checkd)
                layout.setBackgroundColor(Color.YELLOW);
        }
    }
}