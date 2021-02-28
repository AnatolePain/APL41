package com.example.apl41;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Tp02_ex02_01 extends View {

    int choix;

    public Tp02_ex02_01(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.choix = 0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int largeur = 200;

        if(this.choix == 1) {
            Paint croix = new Paint();
            croix.setStyle(Paint.Style.STROKE);
            croix.setStrokeWidth(5);
            canvas.drawLine(220, 70,220 + largeur, 70 + largeur,croix);
            canvas.drawLine(220 + largeur, 70,220, 70 + largeur,croix);
        }else if(this.choix == 2){
            Paint carre = new Paint();
            carre.setStyle(Paint.Style.STROKE);
            carre.setStrokeWidth(5);
            canvas.drawRect(220, 70, 220 + largeur, 70 + largeur, carre);
        }else if(this.choix == 3){
            Paint purpleCircle = new Paint();
            purpleCircle.setStyle(Paint.Style.STROKE);
            purpleCircle.setStrokeWidth(5);
            canvas.drawCircle(this.getMeasuredWidth() / 2, this.getMeasuredHeight() / 2, 120, purpleCircle);
        }else if(this.choix == 4){

        }
    }

    public void change(int checkedId){
        this.choix = checkedId;
        this.invalidate();
    }


}
