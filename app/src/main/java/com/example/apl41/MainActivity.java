package com.example.apl41;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.tp02_ex02_01);

        //Tp03_ex01_01
        /*ImageView image = this.findViewById(R.id.picture_arrow);
        image.setImageResource(R.drawable.fleche_gauche);
        Tp03_ex01_01 controleur = new Tp03_ex01_01(image);
        Button bouton1 = this.findViewById(R.id.right_arrow);
        Button bouton2 = this.findViewById(R.id.left_arrow);
        bouton1.setOnClickListener(controleur);
        bouton2.setOnClickListener(controleur);*/

        //Tp03_ex02_01 (R.layout.tp02_ex02_01)
        RadioGroup radioGroup = this.findViewById(R.id.my_radio_group);
        Tp02_ex02_01 forme = this.findViewById(R.id.forme);
        Tp03_ex02_01 controleur = new Tp03_ex02_01(forme);
        radioGroup.setOnCheckedChangeListener(controleur);
    }
}
