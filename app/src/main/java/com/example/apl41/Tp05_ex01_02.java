package com.example.apl41;

import android.view.MotionEvent;
import android.view.View;

public class Tp05_ex01_02 implements View.OnTouchListener {
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        /*
        int action = motionEvent.getActionMasked();

        if(action == MotionEvent.ACTION_MOVE){
            for(int i = 0 ; i < motionEvent.getPointerCount() ; i++){
                this.vue.movePointer(motionEvent.getPointerId(i),  motionEvent.getX(i), motionEvent.getY(i));
            }
        }
        */




        return true;
    }
}
