package com.example.tritasbih;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    public Button b1, b2, b3, b4, b5, b6, b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        b1 = findViewById(R.id.buttonsub);
        b2 = findViewById(R.id.buttonalh);
        b3= findViewById(R.id.buttonla);
        b4= findViewById(R.id.buttonal);
        b5= findViewById(R.id.buttonas);
        b6= findViewById(R.id.buttonsaw);
        b7= findViewById(R.id.buttonwon);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                opensub();
            }

            private void opensub() {
                Intent intent = new Intent(Activity2.this, sub.class);
                startActivity(intent);

            }


        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openalh();
            }

            private void openalh() {
                Intent intent = new Intent(Activity2.this, alh.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openla();
            }

            private void openla() {
                Intent intent = new Intent(Activity2.this, La.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openal();
            }

            private void openal() {
                Intent intent = new Intent(Activity2.this, Al.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openas();
            }

            private void openas() {
                Intent intent = new Intent(Activity2.this, As.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                opensaw();
            }

            private void opensaw() {
                Intent intent = new Intent(Activity2.this, SAW.class);
                startActivity(intent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openwon();
            }

            private void openwon() {
                Intent intent = new Intent(Activity2.this, won.class);
                startActivity(intent);
            }
        });



    }
}