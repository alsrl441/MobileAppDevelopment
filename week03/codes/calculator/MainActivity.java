package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.edit1);
        editText2 = (EditText) findViewById(R.id.edit2);
        editText3 = (EditText) findViewById(R.id.edit3);
    }

    public void cal_plus(View e) {
        String s1 = editText1.getText().toString();
        String s2 = editText2.getText().toString();

        int result = Integer.parseInt(s1) + Integer.parseInt(s2);
        String text = Integer.toString(result);

        editText3.setText(text);
    }

    public void cal_minus(View e) {
        String s1 = editText1.getText().toString();
        String s2 = editText2.getText().toString();

        int result = Integer.parseInt(s1) - Integer.parseInt(s2);
        String text = Integer.toString(result);

        editText3.setText(text);
    }

    public void cal_multiply(View e) {
        String s1 = editText1.getText().toString();
        String s2 = editText2.getText().toString();

        int result = Integer.parseInt(s1) * Integer.parseInt(s2);
        String text = Integer.toString(result);

        editText3.setText(text);
    }

    public void cal_divide(View e) {
        String s1 = editText1.getText().toString();
        String s2 = editText2.getText().toString();

        int result = Integer.parseInt(s1) / Integer.parseInt(s2);
        String text = Integer.toString(result);

        editText3.setText(text);
    }
}
