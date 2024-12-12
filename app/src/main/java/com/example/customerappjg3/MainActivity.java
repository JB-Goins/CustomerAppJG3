package com.example.customerappjg3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    Button backBTN, nextBTN;
    TextView fnTV, lnTV, emailTV, phoneTV;
    FloatingActionButton add_fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backBTN = findViewById(R.id.backBTN);
        nextBTN = findViewById(R.id.nextBTN);
        fnTV = findViewById(R.id.fnTV);
        lnTV = findViewById(R.id.lnTV);
        emailTV = findViewById(R.id.emailTV);
        phoneTV= findViewById(R.id.phoneTV);
        add_fab = (FloatingActionButton) findViewById(R.id.addFAB);
        add_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(MainActivity.this, AddCustomerActivity.class);
                startActivity(newIntent);


            }
        });
    }
}