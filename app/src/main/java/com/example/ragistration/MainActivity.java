package com.example.ragistration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ragistration.R;

public class MainActivity extends AppCompatActivity {

    private EditText e1;
    private EditText e2;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    public void register() {
        String username = e1.getText().toString().trim();
        String password = e2.getText().toString().trim();

        if (username.isEmpty() || password.isEmpty()) {
            // Show a toast message if any of the fields are empty
            Toast.makeText(this, "Please fill in all the information", Toast.LENGTH_SHORT).show();
        } else {
            // Show a toast message with a welcome message and navigate to the next page
            Toast.makeText(this, "Welcome, " + username + "!", Toast.LENGTH_SHORT).show();

            // TODO: Here you can navigate to the next page and pass the information to it.
            // For simplicity, let's just display the information on the next page using Intent extras.

            // Example of navigating to the next page (ActivityNext) and passing data as extras:

            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("username", username);
            startActivity(intent);



        }
    }
}
