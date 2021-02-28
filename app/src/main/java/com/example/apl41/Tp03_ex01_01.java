package com.example.apl41;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Tp03_ex01_01 implements View.OnClickListener {

    ImageView image;

    public Tp03_ex01_01(ImageView iv){
        this.image = iv;
    }

    @Override
    public void onClick(View view) {

        Resources res = view.getResources();
        String id = res.getResourceEntryName(view.getId());

        if(id.equals("right_arrow")){
            image.setImageResource(R.drawable.fleche_droite);
        }else if(id.equals("left_arrow")){
            image.setImageResource(R.drawable.fleche_gauche);
        }
    }
}
