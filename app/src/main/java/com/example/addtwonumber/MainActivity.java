package com.example.addtwonumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    TextView resultview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.FristNumberEditTextId);
        editText2=findViewById(R.id.secondNumberEditTextId);
        resultview=findViewById(R.id.resultTextViewId);
    }

    public void SummationFunction(View view) {
        Double num1,num2,result;
        num1=Double.parseDouble(editText1.getText().toString());
        num2=Double.parseDouble(editText2.getText().toString());
        result=num1+num2;
        resultview.setText("Summation is "+result);
        //Toast.makeText(this, "summation is "+result, Toast.LENGTH_SHORT).show();

    }
}