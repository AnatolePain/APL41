package com.example.apl41;

import android.widget.RadioGroup;

public class Cm01_ex03_01 implements RadioGroup.OnCheckedChangeListener {

    Cm01_ex02_01 vue;

    public Cm01_ex03_01(Cm01_ex02_01 v){
        this.vue = v;
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.vue.changer(i);
    }
}
