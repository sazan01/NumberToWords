package com.sajan.numbertoword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNum;
    TextView tvWord;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numto_word);

        etNum= findViewById(R.id.etNum);
        tvWord= findViewById(R.id.tvWord);
        btnConvert= findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num;
                num= Integer.parseInt(etNum.getText().toString());

                NumbertoWords numbertoWords= new NumbertoWords(num);
                tvWord.setText(numbertoWords.Words());
            }
        });
    }
}
