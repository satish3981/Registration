package com.example.ragistration;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = findViewById(R.id.t1);
        Intent intent = getIntent();
        String userInput = intent.getStringExtra("USER_INPUT");
        t1.setText(userInput);
    }
}