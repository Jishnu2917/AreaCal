package com.example.jishnu;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView txt = findViewById(R.id.txtResult);

        String shape = getIntent().getStringExtra("shape");
        double area = getIntent().getDoubleExtra("area", 0);

        txt.setText("Area of " + shape + " = " + area);
    }
}
