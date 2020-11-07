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

public class Registration_admin extends AppCompatActivity {

    Button RegisterButton;
    TextView mLoginBtn;
    EditText InputNam, InputPhoneNo, InputEmail, InputPwd, InputAddress;
    ProgressBar progressBar;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_admin);

        RegisterButton = (Button) findViewById(R.id.create_acc_btn1);
        mLoginBtn = findViewById(R.id.textView4);
        InputNam = (EditText) findViewById(R.id.register_username_admin);
        InputPhoneNo = (EditText) findViewById(R.id.register_phone_number_admin);
        InputEmail = (EditText) findViewById(R.id.register_specilazation_admin);
        InputPwd = (EditText) findViewById(R.id.register_workat_admin);
        InputAddress = (EditText) findViewById(R.id.register_gender_admin);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);

        fAuth = FirebaseAuth.getInstance();

        if (fAuth.getCurrentUser() != null)
        {
            startActivity(new Intent(getApplicationContext(),Login_admin.class));
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
                            Toast.makeText(Registration_admin.this, "User Created", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Login_admin.class));

                        } else {
                            Toast.makeText(Registration_admin.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }

                });

                mLoginBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                            Intent intent = new Intent(Registration_admin.this,Login_admin.class);
                            startActivity(intent);
                    }
                });

            }

        });

    }
}



