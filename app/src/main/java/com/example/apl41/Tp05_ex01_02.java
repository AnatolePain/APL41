package com.example.apl41;

import android.content.ClipData;
import android.util.Log;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class Tp05_ex01_02 implements View.OnTouchListener/*, View.OnDragListener*/{

    private Tp05_ex01_01 vue;

    public Tp05_ex01_02(Tp05_ex01_01 v){
        this.vue = v;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        Log.d("DEBUG", "inside onTouuch() ");

        return true;
    }

}
