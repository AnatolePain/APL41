package com.example.apl41;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Tp02_ex01_01 extends View {

    public Tp02_ex01_01(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //blue rect
        Paint fillBlue = new Paint();
        fillBlue.setColor(0xff0000ff);
        canvas.drawRect(10,10, 400,255, fillBlue);

        //purple circle
        Paint purpleCircle = new Paint();
        purpleCircle.setColor(0xff7d007d);
        purpleCircle.setStyle(Paint.Style.STROKE);
        //purpleCircle.setStrokeCap(Paint.Cap.SQUARE);
        //purpleCircle.setStrokeMiter(25);
        purpleCircle.setStrokeWidth(5);
        canvas.drawCircle(550,300, 120,purpleCircle);

        //text
        Paint text = new Paint();
        text.setTextSize(50);
        text.setFakeBoldText(true);
        canvas.drawText("Ceci est un test", 700, 600, text);

        //png
        Paint pngPain = new Paint();
        Resources res = this.getResources();
        Bitmap image = BitmapFactory.decodeResource(res,R.drawable.cercles);
        canvas.drawBitmap(image,200,1000,pngPain);
    }
}
