package com.example.hospitalapp.IPD;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hospitalapp.R;

public class HospitalLogo extends AppCompatActivity implements View.OnClickListener {

    TextView aditya, appolo, cipla, deenanath, kem, jahangir, ruby, sancheti;
    Button Aditya, Appolo, Cipla, Deenanath, Kem, Jahangir, Ruby, Sancheti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_logo);

        aditya=(TextView)findViewById(R.id.aditya);
        appolo=(TextView)findViewById(R.id.appolo);
        cipla=(TextView)findViewById(R.id.cipla);
        deenanath=(TextView)findViewById(R.id.deenanath);
        kem=(TextView)findViewById(R.id.kem);
        jahangir=(TextView)findViewById(R.id.ruby);
        ruby=(TextView)findViewById(R.id.ruby);
        sancheti=(TextView)findViewById(R.id.sancheti);

        Aditya=(Button)findViewById(R.id.buttonAditya);
        Aditya.setOnClickListener(this);


        Appolo=(Button)findViewById(R.id.buttonAppolo);
        Cipla=(Button)findViewById(R.id.buttonCipla);
        Deenanath=(Button)findViewById(R.id.buttonDeenanath);
        Kem=(Button)findViewById(R.id.buttonKem);
        Jahangir=(Button)findViewById(R.id.buttonJah);
        Ruby=(Button)findViewById(R.id.buttonRuby);
        Sancheti=(Button)findViewById(R.id.buttonSancheti);


       Deenanath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(HospitalLogo.this,"Deenanath",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HospitalLogo.this, Deenanathipd.class);
                startActivity(intent);

            }
        });

        Appolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(HospitalLogo.this,"Appolo",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HospitalLogo.this, ApploIPD.class);
                startActivity(intent);

            }
        });

        Aditya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(HospitalLogo.this,"Aditya",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HospitalLogo.this, adityaipd.class);
                startActivity(intent);

            }
        });

        Jahangir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(HospitalLogo.this,"Jahangir",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HospitalLogo.this, jahangiripd.class);
                startActivity(intent);

            }
        });
        Ruby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(HospitalLogo.this,"Ruby Hall",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HospitalLogo.this, rubyhallipd.class);
                startActivity(intent);

            }
        });
        Kem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(HospitalLogo.this,"Kem",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HospitalLogo.this, kemipd.class);
                startActivity(intent);

            }
        });
        Cipla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(HospitalLogo.this,"Cipla",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HospitalLogo.this, ciplaipd.class);
                startActivity(intent);

            }
        });
        Sancheti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(HospitalLogo.this,"Sancheti",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(HospitalLogo.this, sanchetiipd.class);
                startActivity(intent);

            }
        });




        /*Deenanath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"Deenanath ipd ",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,DeenanathIPDActivity.class);
                startActivity(intent);

            }
        });*/

    }

    @Override
    public void onClick(View v) {

    }
    }

