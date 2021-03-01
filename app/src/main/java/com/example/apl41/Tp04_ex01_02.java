package com.example.apl41;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class Tp04_ex01_02 implements View.OnTouchListener {

    Tp04_ex01_01 vue;

    public Tp04_ex01_02(Tp04_ex01_01 v){
        this.vue = v;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        System.out.println("event : " + MotionEvent.actionToString(motionEvent.getActionMasked()));
        System.out.println("pointer count = " + motionEvent.getPointerCount());

        if(motionEvent.getActionMasked() == MotionEvent.ACTION_MOVE){
            this.vue.update();
            //Log.d("DEBUG","getHistroricalX() = " + motionEvent.getHistoricalX());
        }


        return true;
    }

}
