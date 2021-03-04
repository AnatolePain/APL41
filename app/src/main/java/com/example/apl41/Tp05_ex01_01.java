package com.example.apl41;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class Tp05_ex01_01 extends View {

    public Tp05_ex01_01(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int largeur = 200;

        int rayon = 50;
        int reticuleX = 0;
        int reticuleY = 0;
        int dep = 15; //dépassement réticule

        Path reticule = new Path();
        reticule.quadTo(reticuleX, reticuleY,reticuleX + rayon + dep, reticuleY);
        reticule.quadTo(reticuleX, reticuleY,reticuleX - rayon - dep, reticuleY);
        reticule.quadTo(reticuleX, reticuleY,reticuleX , reticuleY + rayon + dep);
        reticule.quadTo(reticuleX, reticuleY,reticuleX , reticuleY - rayon - dep);
        reticule.addCircle(reticuleX, reticuleY, rayon, Path.Direction.CCW);

        //fond gris
        Paint gris = new Paint();
        gris.setColor(Color.DKGRAY);
        canvas.drawRect(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight(), gris);

        Paint couleur = new Paint();
        couleur.setStyle(Paint.Style.STROKE);
        couleur.setColor(Color.YELLOW);
        couleur.setStrokeWidth(5);

        /*
        canvas.drawLine(reticuleX, reticuleY,reticuleX + rayon + dep, reticuleY,couleur);
        canvas.drawLine(reticuleX, reticuleY,reticuleX - rayon - dep, reticuleY,couleur);
        canvas.drawLine(reticuleX, reticuleY,reticuleX , reticuleY + rayon + dep,couleur);
        canvas.drawLine(reticuleX, reticuleY,reticuleX , reticuleY - rayon - dep,couleur;
        canvas.drawCircle(reticuleX, reticuleY, rayon, couleur);
        //canvas.drawLine(220 + largeur, 70,220, 70 + largeur,croix);
        */

        Paint circle = new Paint();

        canvas.drawPath(reticule,couleur);
        reticule.offset(200,300);
    }


}
