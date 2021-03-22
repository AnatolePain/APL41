package com.example.apl41;

import android.content.ClipData;
import android.util.Log;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class Tp05_ex01_02 implements View.OnTouchListener{

    private Tp05_ex01_01 vue;
    private Tp05_ex01_03 mGestureDetector;

    public Tp05_ex01_02(Tp05_ex01_01 v, Tp05_ex01_03 mgd ){
        this.vue = v;
        this.mGestureDetector = mgd;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        Log.d("DEBUG", "inside onTouuch() ");

        Tp05_ex01_01 ma_vue = (Tp05_ex01_01)v;
        ma_vue.refresh(event.getX(),event.getY());

        /*
        if (mGestureDetector.onTouchEvent(event)) {
            return true;
        }

        return super.onTouchEvent(event);

        */
        return true;
    }

}
