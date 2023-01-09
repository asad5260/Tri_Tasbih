package com.example.tritasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class As extends AppCompatActivity {
    int c6=0;
    private Button b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_as);
        b6 = (Button) findViewById(R.id.buttonasm);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c6++;

                b6.setText("আস্তাগফিরুল্লাহ "+c6 );
            }
        });
    }
}