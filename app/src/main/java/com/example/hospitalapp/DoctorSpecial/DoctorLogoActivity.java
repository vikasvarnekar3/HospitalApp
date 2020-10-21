package com.example.hospitalapp.DoctorSpecial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hospitalapp.R;

public class DoctorLogoActivity extends AppCompatActivity {

    private ImageView ayurved, andrology, cosmetic, cardiology;
    private   ImageView childcare, cancer, neurophysiotherapy, dentistry;
    private   ImageView footandankle, homeopathy, jointreplacement,nephrology;

    private Button ayubtn;
    private Button   andrologybtn, cosmeticbtn, cardiologybtn,nephrologybtn;
    private Button childcarebtn, cancerbtn, neurophysiotherapybtn, dentistrybtn;
    private Button footandanklebtn, homeopathybtn, jointreplacementbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_logo);

        ayurved = (ImageView) findViewById(R.id.imageAyurved);
        andrology = (ImageView) findViewById(R.id.imageAndro);
        cosmetic = (ImageView) findViewById(R.id.imageCosmetic);
        cardiology = (ImageView) findViewById(R.id.imageCardiology);

        childcare = (ImageView) findViewById(R.id.imageChild);
        cancer = (ImageView) findViewById(R.id.imageCancer);
        neurophysiotherapy = (ImageView) findViewById(R.id.imagenephrology);
        dentistry = (ImageView) findViewById(R.id.imageDen);

        footandankle = (ImageView) findViewById(R.id.imageFoot);
        homeopathy = (ImageView) findViewById(R.id.imageHomo);
        jointreplacement = (ImageView) findViewById(R.id.imageJoint);


        ayubtn =(Button)findViewById(R.id.buttonAyurved);

        andrologybtn =(Button)findViewById(R.id.buttonAndro);
        cardiologybtn =(Button)findViewById(R.id.buttonCardiology);
        childcarebtn =(Button)findViewById(R.id.buttonChildCare);
        cosmeticbtn =(Button)findViewById(R.id.buttonCosmetic);
        cancerbtn =(Button)findViewById(R.id.buttonCancer);
        dentistrybtn =(Button)findViewById(R.id.buttonDenstry);
        footandanklebtn =(Button)findViewById(R.id.buttonFoot);
        homeopathybtn =(Button)findViewById(R.id.buttonHomo);
        jointreplacementbtn =(Button)findViewById(R.id.buttonJoint);
        nephrologybtn=(Button)findViewById(R.id.buttonNephrology);
        ayubtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(DoctorLogoActivity.this,AyurvedActivity.class);
                startActivity(intent);
            }
        });
        andrologybtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(DoctorLogoActivity.this,Andrology.class);
                startActivity(intent);
            }
        });


        cardiologybtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(DoctorLogoActivity.this,Cardiology.class);
                startActivity(intent);
            }
        });

        childcarebtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(DoctorLogoActivity.this,ChildCare.class);
                startActivity(intent);
            }
        });
        cosmeticbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(DoctorLogoActivity.this,Cosmetic.class);
                startActivity(intent);
            }
        });
        cancerbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(DoctorLogoActivity.this,Cancer.class);
                startActivity(intent);
            }
        });
        dentistrybtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(DoctorLogoActivity.this,Dentistry.class);
                startActivity(intent);
            }
        });
        footandanklebtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(DoctorLogoActivity.this,FootAndAnkle.class);
                startActivity(intent);
            }
        });
        homeopathybtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(DoctorLogoActivity.this,Homopathy.class);
                startActivity(intent);
            }
        });
        jointreplacementbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(DoctorLogoActivity.this,JointAndReplacement.class);
                startActivity(intent);
            }
        });

        nephrologybtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(DoctorLogoActivity.this, Nephrology.class);
                startActivity(intent);
            }
        });

    }
}
