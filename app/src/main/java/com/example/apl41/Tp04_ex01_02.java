package com.example.apl41;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.MotionEvent;
import android.view.View;

public class Tp04_ex01_02 implements View.OnTouchListener {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        System.out.println("event : " + MotionEvent.actionToString(motionEvent.getActionMasked()));
        return false;
    }
}
