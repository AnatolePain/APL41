package com.example.apl41;

import android.widget.RadioGroup;

public class Tp03_ex02_01 implements RadioGroup.OnCheckedChangeListener {

    Tp02_ex02_01 forme;

    public Tp03_ex02_01(Tp02_ex02_01 forme){
        this.forme = forme;
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        forme.change(i);
    }
}
