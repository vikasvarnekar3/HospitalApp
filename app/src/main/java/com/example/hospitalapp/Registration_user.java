package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Registration_user extends AppCompatActivity {

    Button RegisterButton;
    TextView mLoginBtn;
    EditText InputNam, InputPhoneNo, InputEmail, InputPwd, InputAddress;
    ProgressBar progressBar;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_user);

        RegisterButton = (Button) findViewById(R.id.create_acc_btn1);
        mLoginBtn = findViewById(R.id.Login2);
        InputNam = (EditText) findViewById(R.id.register_username_user);
        InputPhoneNo = (EditText) findViewById(R.id.register_phone_number_user);
        InputEmail = (EditText) findViewById(R.id.register_email_user);
        InputPwd = (EditText) findViewById(R.id.register_password_user);
        InputAddress = (EditText) findViewById(R.id.register_address_user);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        fAuth = FirebaseAuth.getInstance();

        if (fAuth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(), Login_user.class));
            finish();
        }
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name = InputNam.getText().toString().trim();
                final String phone_no = InputPhoneNo.getText().toString().trim();
                final String email = InputEmail.getText().toString().trim();
                final String password = InputPwd.getText().toString().trim();
                final String address = InputAddress.getText().toString().trim();
                if (TextUtils.isEmpty(name)) {
                    InputNam.setError("Name is required");
                    return;
                }

                if (TextUtils.isEmpty(email))
                {
                    InputEmail.setError("Email is Required");
                    return;
                }

                if (TextUtils.isEmpty(phone_no)) {
                    InputPhoneNo.setError("Phone number is required");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    InputPwd.setError("Password is required");
                    return;
                }
                if (TextUtils.isEmpty(address)) {
                    InputPwd.setError("Address is required");
                    return;
                }
                if (password.length() < 8) {
                    InputPwd.setError("Password must be  greater than or equal to 8 characters.");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);

                fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Registration_user.this, "User Created", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Login_admin.class));

                        } else {
                            Toast.makeText(Registration_user.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }

                });


                mLoginBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent loginintent = new Intent(Registration_user.this, Login_user.class);
                        startActivity(loginintent);
                    }
                });

            }
        });
    }
}