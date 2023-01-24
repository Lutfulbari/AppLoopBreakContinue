package com.lutful.apploopbreakcontinue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.tvDisplay);

        for (int x=1; x<=10; x++){
            int mul = 5*x;
            tvDisplay.append("5 * "+x+"= "+ 5*x +"\n");
        if (x==5) break;

    }
}