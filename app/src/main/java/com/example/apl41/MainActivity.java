package com.example.apl41;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.tp05_ex01_01);
        //PreferenceManager.setDefaultValues();

        //Tp03_ex01_01
        /*
        ImageView image = this.findViewById(R.id.picture_arrow);
        image.setImageResource(R.drawable.fleche_droite);
        Tp03_ex01_01 controleur = new Tp03_ex01_01(image);
        Button bouton1 = this.findViewById(R.id.right_arrow);
        Button bouton2 = this.findViewById(R.id.left_arrow);
        bouton1.setOnClickListener(controleur);
        bouton2.setOnClickListener(controleur);
        */


        //Tp03_ex02_01 (R.layout.tp02_ex02_01)
        /*
        RadioGroup radioGroup = this.findViewById(R.id.my_radio_group);
        Tp02_ex02_01 forme = this.findViewById(R.id.forme);
        Tp03_ex02_01 controleur = new Tp03_ex02_01(forme);
        radioGroup.setOnCheckedChangeListener(controleur);
        */

        //tp04_ex01_01
        /*
        Tp04_ex01_01 vue = this.findViewById(R.id.poids);
        Tp04_ex01_02 controleur = new Tp04_ex01_02(vue);
        vue.setOnTouchListener(controleur);
        */


        //tp04_ex02_02
        /*
        TableLayout tb = this.findViewById(R.id.grille);
        Tp04_ex02_02 vue = new Tp04_ex02_02(tb);
        Tp04_ex02_01 controleur = new Tp04_ex02_01(vue);
        */

        //tp05_ex01_01

        Tp05_ex01_01 vue = this.findViewById(R.id.reticule);
        Tp05_ex01_03 controleur2 = new Tp05_ex01_03();
        Tp05_ex01_02 controleur1 = new Tp05_ex01_02(vue,controleur2);
        //vue.setOnDragListener(controleur1);
        vue.setOnTouchListener(controleur1);
        //vue.setOnTouchListener(controleur2);
        //onscroll()


        //tp06_ex01_02
        /*
        TextView tv = findViewById(R.id.textViewTp06);
        Button[] array_button = new Button[4];
        Tp06_ex01_01 controleur = new Tp06_ex01_01(tv);

        array_button[0] = findViewById(R.id.A);
        array_button[1] = findViewById(R.id.T);
        array_button[2] = findViewById(R.id.C);
        array_button[3] = findViewById(R.id.G);
        for(int i = 0 ; i < 4 ; i++){
            array_button[i].setOnClickListener(controleur);
        }
        */

        //cm01_ex01_01
        /*
        RadioGroup monGroupeDeBouton = findViewById(R.id.le_groupe_de_boutons);
        Cm01_ex02_01 vue = findViewById(R.id.grand_rectangle);
        Cm01_ex03_01 controleur = new Cm01_ex03_01(vue);
        monGroupeDeBouton.setOnCheckedChangeListener(controleur);
        Cm01_ex04_01 controleurTouche = new Cm01_ex04_01(vue);
        vue.setOnTouchListener(controleurTouche);
        */

    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);
    }
}
