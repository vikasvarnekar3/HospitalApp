package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hospitalapp.DoctorSpecial.DoctorLogoActivity;
import com.example.hospitalapp.HealthPackage.hospitallogohealth;
import com.example.hospitalapp.IPD.HospitalLogo;
import com.example.hospitalapp.OPD.hospitallogoodp;

public class main extends AppCompatActivity {

    Button buttonDisease, buttonDoctor, buttonFacility, buttonHealth, buttonIPD, buttonOPD;
    TextView search, disease, doctor, facility, health, ipd, opd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonDisease=(Button)findViewById(R.id.buttonDisease);
        buttonDoctor=(Button)findViewById(R.id.buttonDoctor);
        buttonFacility=(Button)findViewById(R.id.buttonFacility);
        buttonHealth=(Button)findViewById(R.id.buttonHealth);
        buttonIPD=(Button)findViewById(R.id.buttonIPD);
        buttonOPD=(Button)findViewById(R.id.buttonOPD);


        disease= findViewById(R.id.disease);
        doctor= findViewById(R.id.doctor);
        facility= findViewById(R.id.facility);
        ipd= findViewById(R.id.ipd);
        opd= findViewById(R.id.opd);
        health= findViewById(R.id.health);


        buttonDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(main.this,"Hospitals",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(main.this, DoctorLogoActivity.class);
                startActivity(intent);

            }
        });

        buttonOPD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(main.this,"OPD",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(main.this, hospitallogoodp.class);
                startActivity(intent);

            }
        });

        buttonHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(main.this,"Health Packages",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(main.this, hospitallogohealth.class);
                startActivity(intent);

            }
        });

        buttonIPD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(main.this,"IPD",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(main.this, HospitalLogo.class);
                startActivity(intent);

            }
        });

        buttonFacility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(main.this,"Facilities",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(main.this, com.example.hospitalapp.Facility.facility.class);
                startActivity(intent);

            }
        });


    }
}
