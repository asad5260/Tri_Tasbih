package com.example.tritasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sub extends AppCompatActivity {
    int c2=0;
    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        b2 = (Button) findViewById(R.id.buttonsub);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                c2++;

                b2.setText("সুবাহান আল্লাহ "+c2 );
            }
        });
    }
}