package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView=findViewById(R.id.editTextNumberDecimal);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                String s = textView.getText().toString();
                int m= Integer.parseInt(s);
                double c= 100 * m;
                textView.setText("THE VALUE IN CM IS "+c);
            }
        });
    }
}