package com.example.tehtava2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button3;
    private Button button4;
    private Button button5;

    private ImageView ImageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button3 = findViewById(R.id.button3);
        this.button4 = findViewById(R.id.button4);
        this.button5 = findViewById(R.id.button5);

        this.ImageView4 = findViewById(R.id.imageView4);

        this.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button4.setEnabled(!button4.isEnabled());
                button5.setEnabled(!button5.isEnabled());




            }
        });

        this.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView4.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "lyhyt", Toast.LENGTH_SHORT).show();
            }
        });
        this.button5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ImageView4.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "pitkä", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }


}
