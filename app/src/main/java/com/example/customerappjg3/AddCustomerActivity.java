package com.example.customerappjg3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddCustomerActivity extends AppCompatActivity {
    Button subBTN;
    EditText fnET, lnET, emailET, phoneET;
    String  fName,  lName,  email,  phone;
    Customer myCustomer;
    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);

        subBTN = findViewById(R.id.subBTN);
        fnET = findViewById(R.id.fnET);
        lnET = findViewById(R.id.lnET);
        emailET = findViewById(R.id.emailET);
        phoneET= findViewById(R.id.phoneET);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("message");

        subBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fName = fnET.getText().toString();
                lName = lnET.getText().toString();
                email = emailET.getText().toString();
                phone = phoneET.getText().toString();
                Customer myCustomer = new Customer(fName, lName, email, phone);
                //myRef.setValue(myCustomer);
                String key = myRef.push().getKey();
                myRef.child(key).setValue(myCustomer);

            }
        });

        

    }
}