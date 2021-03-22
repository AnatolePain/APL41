package com.example.apl41;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Cm01_ex02_01 extends View {

    private Path angleDroit;
    private Paint grasEtBlanc;
    private int typeJointure;
    private int epaisseurChemin;
    private boolean init;

    public Cm01_ex02_01(Context context, AttributeSet attrs) {
        super(context, attrs);

        typeJointure = 1;
        epaisseurChemin = 100;
        init = true;

        grasEtBlanc = new Paint();
        grasEtBlanc.setColor(Color.WHITE);
        grasEtBlanc.setStyle(Paint.Style.STROKE);
        grasEtBlanc.setStrokeWidth(100);

        angleDroit = new Path();
        angleDroit.lineTo(150, 150);
        angleDroit.lineTo(0, 300);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(this.init) {
            angleDroit.offset((this.getMeasuredWidth() / 2) - 50, (this.getMeasuredHeight() - (150 * 2)) / 2);
            this.init = false;
        }

        if(typeJointure == 1){
            grasEtBlanc.setStrokeWidth(epaisseurChemin);
            grasEtBlanc.setStrokeJoin(Paint.Join.MITER);
            canvas.drawPath(angleDroit, grasEtBlanc);
        }else if (typeJointure == 2){
            grasEtBlanc.setStrokeWidth(epaisseurChemin);
            grasEtBlanc.setStrokeJoin(Paint.Join.BEVEL);
            canvas.drawPath(angleDroit, grasEtBlanc);
        }else if (typeJointure == 3){
            grasEtBlanc.setStrokeWidth(epaisseurChemin);
            grasEtBlanc.setStrokeJoin(Paint.Join.ROUND);
            canvas.drawPath(angleDroit, grasEtBlanc);
        }
    }

    public void changer(int checkedid){
        this.typeJointure = checkedid;
        this.invalidate();
    }

    public void reduireTrait(){
        this.epaisseurChemin = 10;
        this.invalidate();
    }

    public void reinitialiserTrait(){
        this.epaisseurChemin = 100;
        this.invalidate();
    }
}
