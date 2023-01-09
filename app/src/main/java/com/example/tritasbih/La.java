package com.example.tritasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class La extends AppCompatActivity {
    int c4=0;
    private Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la);
        b4 = (Button) findViewById(R.id.buttonlam);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4++;

                b4.setText("লা ইলাহা ইললাল্লাহ "+c4 );
            }
        });
    }
}