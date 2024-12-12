package com.example.customerappjg3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class AddCustomerActivity extends AppCompatActivity {
    Button subBTN;
    EditText fnET, lnET, emailET, phoneET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);

        subBTN = findViewById(R.id.subBTN);
        fnET = findViewById(R.id.fnET);
        lnET = findViewById(R.id.lnET);
        emailET = findViewById(R.id.emailET);
        phoneET= findViewById(R.id.phoneET);

        subBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        

    }
}