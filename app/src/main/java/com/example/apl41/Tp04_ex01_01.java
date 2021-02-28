package com.example.apl41;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Tp04_ex01_01 extends View {
    public Tp04_ex01_01(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //fond gris
        Paint gris = new Paint();
        gris.setColor(Color.DKGRAY);
        canvas.drawRect(0,0,this.getMeasuredWidth(),this.getMeasuredHeight(),gris);

        //purple circle
        Paint purpleCircle = new Paint();
        purpleCircle.setColor(0xff7d007d);
        canvas.drawCircle(550,300, 90,purpleCircle);
    }
}
