package com.example.tritasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class won extends AppCompatActivity {
    int c8=0;
    private Button b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_won);
        b8 = (Button) findViewById(R.id.buttonwonm);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c8++;

                b8.setText(""+c8 +"বার" );
            }
        });
    }
}