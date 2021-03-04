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

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        int action = motionEvent.getActionMasked();

        if (action == MotionEvent.ACTION_DOWN){
            this.vue.addPointer(motionEvent.getPointerId(0),  motionEvent.getX(), motionEvent.getY());
        }

        if(action == MotionEvent.ACTION_POINTER_DOWN ){
            int index = motionEvent.getActionIndex();
            this.vue.addPointer(motionEvent.getPointerId(index),  motionEvent.getX(index), motionEvent.getY(index));
        }

        if(action == MotionEvent.ACTION_MOVE){
            for(int i = 0 ; i < motionEvent.getPointerCount() ; i++){
                this.vue.movePointer(motionEvent.getPointerId(i),  motionEvent.getX(i), motionEvent.getY(i));
            }
        }

        if(action == MotionEvent.ACTION_POINTER_UP){
            this.vue.remove(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }

        if(action == MotionEvent.ACTION_UP){
            for(int i = 0 ; i < motionEvent.getPointerCount() ; i++){
                this.vue.removeAllPointer(motionEvent.getPointerId(i));
            }
        }

        return true;
    }

}
