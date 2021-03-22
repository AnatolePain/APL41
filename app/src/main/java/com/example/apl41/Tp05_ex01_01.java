package com.example.apl41;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class Tp05_ex01_01 extends View {

    private Path reticule;
    private Paint couleur;

    private float saveReticuleX;
    private float saveReticuleY;

    private float reticuleX;
    private float reticuleY;
    private GestureDetector geste;

    public Tp05_ex01_01(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.reticuleX = 0;
        this.reticuleY = 0;

        this.saveReticuleX = 0;
        this.saveReticuleY = 0;

        int largeur = 200;
        int rayon = 50;
        int dep = 15; //dépassement réticule

        this.reticule = new Path();
        reticule.quadTo(reticuleX, reticuleY,reticuleX + rayon + dep, reticuleY);
        reticule.quadTo(reticuleX, reticuleY,reticuleX - rayon - dep, reticuleY);
        reticule.quadTo(reticuleX - rayon - dep, reticuleY,reticuleX, reticuleY);
        reticule.quadTo(reticuleX, reticuleY,reticuleX , reticuleY + rayon + dep);
        reticule.quadTo(reticuleX, reticuleY,reticuleX , reticuleY - rayon - dep);
        reticule.addCircle(reticuleX, reticuleY, rayon, Path.Direction.CCW);

        this.couleur = new Paint();
        couleur.setStyle(Paint.Style.STROKE);
        couleur.setColor(Color.YELLOW);
        couleur.setStrokeWidth(5);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //fond gris
        Paint gris = new Paint();
        gris.setColor(Color.DKGRAY);
        canvas.drawRect(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight(), gris);

        //reticule
        reticule.offset(-this.saveReticuleX,-this.saveReticuleY);
        reticule.offset(this.reticuleX,this.reticuleY);
        this.saveReticuleX = reticuleX;
        this.saveReticuleY = reticuleY;
        canvas.drawPath(reticule,couleur);
    }

    public void refresh(float x , float y){
        this.reticuleX = x;
        this.reticuleY = y;
        this.invalidate();
    }

}
