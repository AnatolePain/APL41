package com.example.apl41;

import android.view.GestureDetector;
import android.view.MotionEvent;

public class Tp04_ex02_01 implements GestureDetector.OnGestureListener {

    private Tp04_ex02_02 vue;

    public Tp04_ex02_01(Tp04_ex02_02 v){
        this.vue = v;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
}
