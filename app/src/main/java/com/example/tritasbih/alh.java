package com.example.tritasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alh extends AppCompatActivity {
    int c3=0;
    private Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alh);
        b3 = (Button) findViewById(R.id.buttonalhm);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c3++;

                b3.setText("আলহামদুলিল্লাহ "+c3 );
            }
        });
    }
}