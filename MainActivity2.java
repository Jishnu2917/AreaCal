package com.example.jishnu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    EditText edt1, edt2;
    String shape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        Button btnCalc = findViewById(R.id.btnCalc);

        shape = getIntent().getStringExtra("shape");

        if (shape.equals("square") || shape.equals("circle")) {
            edt2.setVisibility(View.GONE);
        }

        btnCalc.setOnClickListener(v -> {
            double a = Double.parseDouble(edt1.getText().toString());
            double b = edt2.getVisibility() == View.VISIBLE
                    ? Double.parseDouble(edt2.getText().toString())
                    : 0;

            double area = 0;

            switch (shape) {
                case "square":
                    area = a * a;
                    break;
                case "rectangle":
                    area = a * b;
                    break;
                case "triangle":
                    area = 0.5 * a * b;
                    break;
                case "circle":
                    area = 3.14 * a * a;
                    break;
            }

            Intent i = new Intent(MainActivity2.this, MainActivity3.class);
            i.putExtra("shape", shape);
            i.putExtra("area", area);
            startActivity(i);
        });
    }
}
