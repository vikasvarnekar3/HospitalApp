package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hospitalapp.Model.Users;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/*import com.example.hospitalapp.Privalent.Prevalent;*/

public class Login_user extends AppCompatActivity {
  /*  public Button button;*/
    EditText mphone, mPassword;
    Button mLoginBtn;
    Button mCreateBtn;
    ProgressBar progressBar;
    CheckBox showpassword1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        mphone = findViewById(R.id.login_phone_user);
        mPassword = findViewById(R.id.login_password_user);
        progressBar = findViewById(R.id.progressBar2);
        /*button = (Button) findViewById(R.id.login_user);*/
        mLoginBtn = findViewById(R.id.login_user);
        showpassword1 = findViewById(R.id.showpassword1);
        mCreateBtn = findViewById(R.id.Register_here1);

        showpassword1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    mPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else
                {
                    mPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String phone = mphone.getText().toString().trim();
                final String password = mPassword.getText().toString().trim();
                if (TextUtils.isEmpty(phone)) {
                    mphone.setError("Phone id is required");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    mPassword.setError("Password is required");
                    return;
                }
                if (password.length() < 8) {
                    mPassword.setError("Password must be  greater than or equal to 8 characters.");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                final DatabaseReference RootRef;
                RootRef = FirebaseDatabase.getInstance().getReference();
                RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.child("User").child(phone).exists()) {
                            Users userData = dataSnapshot.child("User").child(phone).getValue(Users.class);

                            if (userData.getPhone_no().equals(phone)) {
                                if (userData.getPassword().equals(password)) {

                                    Toast.makeText(Login_user.this, "Logged in successfully", Toast.LENGTH_SHORT).show();


                                    Intent createintent = new Intent(Login_user.this, main.class);
                                    /*Prevalent.CurrentOnlineUser =userData;*/
                                    startActivity(createintent);
                                    finish();


                                } else {
                                    Toast.makeText(Login_user.this, "Password is incorrect.", Toast.LENGTH_SHORT).show();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        } else {
                            Toast.makeText(Login_user.this, "Account with this  " + phone + "number do not exist", Toast.LENGTH_SHORT).show();
                            Toast.makeText(Login_user.this, "You need to create a new account.", Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.INVISIBLE);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        mCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent createintent =new Intent(Login_user.this,Registration_user.class);
                startActivity(createintent);
                finish();
            }
        });


    }
}
