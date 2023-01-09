package com.example.tritasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SAW extends AppCompatActivity {
    int c7=0;
    private Button b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saw);
        b7 = (Button) findViewById(R.id.buttonsawm);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c7++;

                b7.setText("সাললাল্লাহু আলাইহি ওয়া সাল্লাম "+c7 );
            }
        });
    }
}