package com.example.tritasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Al extends AppCompatActivity {
    int c5=0;
    private Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al);
        b5 = (Button) findViewById(R.id.buttonalm);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c5++;

                b5.setText("আল্লাহু আকবার "+c5 );
            }
        });
    }
}