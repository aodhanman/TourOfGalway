package com.example.aodhan.tourofgalway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class convert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);

        Button euro = (Button)findViewById(R.id.eurobutton);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText eurotext = (EditText)findViewById(R.id.eurotext);

                double money = 0;
                double dollar = 1.2;
                double sterling = 0.80;
                if(eurotext.getText()!= null) {
                    money = Double.parseDouble(String.valueOf(eurotext.getText()));


                    TextView dollarapp = (TextView) findViewById(R.id.dollartext);
                    dollarapp.setText(Double.toString(dollar * money));
                    TextView sterlingapp = (TextView) findViewById(R.id.sterlingtext);
                    sterlingapp.setText(Double.toString(sterling * money));

                }
            }
        });
    }
}
