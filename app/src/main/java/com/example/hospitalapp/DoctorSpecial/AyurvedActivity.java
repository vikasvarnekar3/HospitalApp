package com.example.hospitalapp.DoctorSpecial;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hospitalapp.R;

public class AyurvedActivity extends AppCompatActivity {


    private ImageView ayurved, andrology, cosmetic, cardiology;
    private   ImageView childcare, cancer, neurophysiotherapy, dentistry;
    private   ImageView footandankle, homeopathy, jointreplacement;/* nephrology*/;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayurved);


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
    }
}
