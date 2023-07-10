package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, result_text;
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcome_text = findViewById(R.id.textView2);
        result_text = findViewById(R.id.textView);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //storing the val of edit text and using parse double to covert from string to double
                double kilos_entered = Double.parseDouble(editText.getText().toString());


                //display the text
                result_text.setText(""+ convertToPounds(kilos_entered) + " lb");

            }
        });

    }


    public double convertToPounds(double kilos){

        double poundResults = kilos* 2.20462;
        return poundResults;


    }
}