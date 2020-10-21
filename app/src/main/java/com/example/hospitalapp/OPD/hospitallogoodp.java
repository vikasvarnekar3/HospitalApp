package com.example.hospitalapp.OPD;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hospitalapp.R;

public class hospitallogoodp extends AppCompatActivity {

    TextView aditya, appolo, cipla, deenanath, kem, jahangir, ruby, sancheti;
    Button Aditya, Appolo, Cipla, Deenanath, Kem, Jahangir, Ruby, Sancheti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitallogoodp);


        aditya=(TextView)findViewById(R.id.aditya1);
        appolo=(TextView)findViewById(R.id.appolo1);
        cipla=(TextView)findViewById(R.id.cipla1);
        deenanath=(TextView)findViewById(R.id.deenanath1);
        kem=(TextView)findViewById(R.id.kem1);
        jahangir=(TextView)findViewById(R.id.ruby1);
        ruby=(TextView)findViewById(R.id.ruby1);
        sancheti=(TextView)findViewById(R.id.sancheti1);

        Aditya=(Button)findViewById(R.id.buttonAditya1);


        Appolo=(Button)findViewById(R.id.buttonAppolo1);
        Cipla=(Button)findViewById(R.id.buttonCipla1);
        Deenanath=(Button)findViewById(R.id.buttonDeenanath1);
        Kem=(Button)findViewById(R.id.buttonKem1);
        Jahangir=(Button)findViewById(R.id.buttonJah1);
        Ruby=(Button)findViewById(R.id.buttonRuby1);
        Sancheti=(Button)findViewById(R.id.buttonSancheti1);


        Deenanath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogoodp.this,"Deenanath",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogoodp.this, dmhopd.class);
                startActivity(intent);

            }
        });

        Appolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogoodp.this,"Appolo",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogoodp.this, apploopd.class);
                startActivity(intent);

            }
        });

        Aditya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogoodp.this,"Aditya",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogoodp.this, adityaopd.class);
                startActivity(intent);

            }
        });

        Jahangir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogoodp.this,"Jahangir",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogoodp.this, jahangiropd.class);
                startActivity(intent);

            }
        });
        Ruby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogoodp.this,"Ruby Hall",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogoodp.this, rubyopd.class);
                startActivity(intent);

            }
        });
        Kem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogoodp.this,"Kem",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogoodp.this, kemopd.class);
                startActivity(intent);

            }
        });
        Cipla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogoodp.this,"Cipla",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogoodp.this, ciplaopd.class);
                startActivity(intent);

            }
        });
        Sancheti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogoodp.this,"Sancheti",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogoodp.this, sanchetiopd.class);
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


    }

