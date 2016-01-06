package com.example.notes4kids.app;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by cansint on 05.01.2016.
 */
public class Mode1Activity extends MainActivity {

    Button buttonFa = (Button)findViewById(R.id.buttonFa);
    Button buttonSol = (Button)findViewById(R.id.buttonSol);
    Button buttonMi = (Button)findViewById(R.id.buttonMi);
    Button buttonRe = (Button)findViewById(R.id.buttonRe);
    Button buttonSi = (Button)findViewById(R.id.buttonSi);
    Button buttonLa = (Button)findViewById(R.id.buttonLa);
    Button buttonDo = (Button)findViewById(R.id.buttonDo);
    ImageView note = (ImageView)findViewById(R.id.imageView3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mode_1);
        Random random=new Random();

    }

}
