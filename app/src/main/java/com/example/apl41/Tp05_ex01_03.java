package com.example.apl41;

import android.view.DragEvent;
import android.view.View;

public class Tp05_ex01_03 implements View.OnDragListener {

    private Tp05_ex01_01 vue;

    public Tp05_ex01_03(Tp05_ex01_01 v){
        this.vue = v;
    }

    @Override
    public boolean onDrag(View view, DragEvent dragEvent) {

        if(dragEvent.getAction() ==  DragEvent.ACTION_DRAG_STARTED){
            this.vue.drag(dragEvent.getX(),dragEvent.getY());
        }


        return true;
    }
}
