package com.example.apl41;

import android.view.MotionEvent;
import android.view.View;

public class Cm01_ex04_01 implements View.OnTouchListener {

    private Cm01_ex02_01 vue;

    public Cm01_ex04_01(Cm01_ex02_01 v){
        this.vue = v;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        int action = motionEvent.getActionMasked();

        if(action == MotionEvent.ACTION_POINTER_DOWN ){
            this.vue.reduireTrait();
        }
        if(action == MotionEvent.ACTION_POINTER_UP){
            this.vue.reinitialiserTrait();
        }

        return true;
    }
}
