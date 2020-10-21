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
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Registration_user extends AppCompatActivity {

    Button RegisterButton;
    TextView mLoginBtn;
    EditText InputNam, InputPhoneNo, InputEmail, InputPwd ,InputAddress;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_user);

          RegisterButton = (Button) findViewById(R.id.create_acc_btn1);
        mLoginBtn =findViewById(R.id.Login_here1);
        InputNam = (EditText) findViewById(R.id.register_username_user);
        InputPhoneNo = (EditText) findViewById(R.id.register_phone_number_user);
        InputEmail = (EditText) findViewById(R.id.register_email_user);
        InputPwd = (EditText) findViewById(R.id.register_password_user);
        InputAddress=(EditText) findViewById(R.id.register_address_user);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        RegisterButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                final String name = InputNam.getText().toString().trim();
                final String phone_no = InputPhoneNo.getText().toString().trim();
                final String email = InputEmail.getText().toString().trim();
                final String password = InputPwd.getText().toString().trim();
                final String address = InputAddress.getText().toString().trim();
                if (TextUtils.isEmpty(name))
                {
                    InputNam.setError("Name is required");
                    return;
                }
                if (TextUtils.isEmpty(phone_no))
                {
                    InputPhoneNo.setError("Phone number is required");
                    return;
                }
                if (TextUtils.isEmpty(password))
                {
                    InputPwd.setError("Password is required");
                    return;
                }
                if (TextUtils.isEmpty(address))
                {
                    InputPwd.setError("Address is required");
                    return;
                }
                if (password.length() < 8)
                {
                    InputPwd.setError("Password must be  greater than or equal to 8 characters.");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);

                final DatabaseReference RootRef;
                RootRef = FirebaseDatabase.getInstance().getReference();
                RootRef.addListenerForSingleValueEvent(new ValueEventListener()
                {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                    {
                        if (!(dataSnapshot.child("Users").child(phone_no).exists()))
                        {
                            HashMap<String, Object> userdataMap = new HashMap<>();
                            userdataMap.put("email",email);
                            userdataMap.put("address",address);
                            userdataMap.put("password",password);
                            userdataMap.put("phone_no",phone_no);
                            userdataMap.put("name",name);

                            RootRef.child("User").child(phone_no).updateChildren(userdataMap)
                                    .addOnCompleteListener(new OnCompleteListener<Void>()
                                    {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task)
                                        {
                                            if(task.isSuccessful())
                                            {
                                                Toast.makeText(Registration_user.this, "Congratulations admin, your account has been created.", Toast.LENGTH_SHORT).show();
                                                Intent intent =new Intent(Registration_user.this,Login_user.class);
                                                startActivity(intent);
                                                finish();
                                            }
                                            else
                                            {

                                                Toast.makeText(Registration_user.this, "Network error...Please try again", Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    });
                        }
                        else
                        {
                            Toast.makeText(Registration_user.this, "This " + phone_no + "already exists", Toast.LENGTH_SHORT).show();
                            Toast.makeText(Registration_user.this, "Please try again using another phone number", Toast.LENGTH_SHORT).show();
                        }
                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError)
                    {

                    }
                });
            }
        });
        mLoginBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent loginintent =new Intent(Registration_user.this,Login_user.class);
                startActivity(loginintent);
            }
        });


    }
}
