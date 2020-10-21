package com.example.hospitalapp.HealthPackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hospitalapp.R;

public class hospitallogohealth extends AppCompatActivity {


    TextView aditya, appolo,  deenanath, kem, jahangir, ruby;
    Button Aditya, Appolo,  Deenanath, Kem, Jahangir, Ruby;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitallogohealth);


        aditya=(TextView)findViewById(R.id.aditya2);
        appolo=(TextView)findViewById(R.id.appolo2);

        deenanath=(TextView)findViewById(R.id.deenanath2);
        kem=(TextView)findViewById(R.id.kem2);
        jahangir=(TextView)findViewById(R.id.jahangir2);
        ruby=(TextView)findViewById(R.id.ruby2);


        Aditya=(Button)findViewById(R.id.buttonAditya2);


        Appolo=(Button)findViewById(R.id.buttonAppolo2);

        Deenanath=(Button)findViewById(R.id.buttonDeenanath2);
        Kem=(Button)findViewById(R.id.buttonKem2);
        Jahangir=(Button)findViewById(R.id.buttonJah2);
        Ruby=(Button)findViewById(R.id.buttonRuby2);



        Aditya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogohealth.this,"Aditya Health Package",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogohealth.this, adityahealth.class);
                startActivity(intent);

            }
        });

        Jahangir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogohealth.this,"Jahangir Health Package",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogohealth.this, jahangirhealth.class);
                startActivity(intent);

            }
        });

        Ruby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogohealth.this,"Ruby Hall Health Package",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogohealth.this, rubyhealth.class);
                startActivity(intent);

            }
        });

        Deenanath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogohealth.this,"dmh Health Package",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogohealth.this, dmhhealth.class);
                startActivity(intent);

            }
        });

        Kem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogohealth.this,"Kem Health Package",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogohealth.this, kemhealth.class);
                startActivity(intent);

            }
        });

        Appolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(hospitallogohealth.this,"Appolo Health Package",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(hospitallogohealth.this, applohealth.class);
                startActivity(intent);

            }
        });


    }
}
