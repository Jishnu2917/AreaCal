package com.example.jishnu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = v -> {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);

            if (v.getId() == R.id.btnSquare)
                i.putExtra("shape", "square");
            else if (v.getId() == R.id.btnRectangle)
                i.putExtra("shape", "rectangle");
            else if (v.getId() == R.id.btnTriangle)
                i.putExtra("shape", "triangle");
            else
                i.putExtra("shape", "circle");

            startActivity(i);
        };

        findViewById(R.id.btnSquare).setOnClickListener(listener);
        findViewById(R.id.btnRectangle).setOnClickListener(listener);
        findViewById(R.id.btnTriangle).setOnClickListener(listener);
        findViewById(R.id.btnCircle).setOnClickListener(listener);
    }
}
