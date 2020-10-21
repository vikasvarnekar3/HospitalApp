package com.example.hospitalapp.Facility;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hospitalapp.R;

public class facility extends AppCompatActivity {


    private Button AmbButton1,BloodButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility);


        AmbButton1 = (Button) findViewById(R.id.ambulance);
        BloodButton2 = (Button) findViewById(R.id.bloodbank);

        AmbButton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(facility.this, ambulance.class);
                startActivity(intent);
            }
        });
        BloodButton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(facility.this, bloodbank
                        .class);
                startActivity(intent);
            }
        });


    }
}
