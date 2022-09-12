package com.example.tasbeehcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView count;
    Button tap;
    ImageView restart;
    int ans = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = findViewById(R.id.textView);
        tap = findViewById(R.id.button);
        restart = findViewById(R.id.imageView2);
        Log.d("HELP", "onCreate: inside app");
        tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("HELP", "onCreate: inside tap");
                ans++;
                count.setText(String.valueOf(ans));
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("HELP", "onCreate: inside restart");
                ans = 0;
                count.setText(String.valueOf(ans));
            }
        });
    }
}