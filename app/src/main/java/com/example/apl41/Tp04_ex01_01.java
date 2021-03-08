package com.example.apl41;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Tp04_ex01_01 extends View {

    List<Tp04_ex01_03> pointerList = new LinkedList<>();

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

        for(Tp04_ex01_03 poid : pointerList){
            if(poid.getAffiche()){
                Paint randomColor = new Paint();
                randomColor.setColor(poid.getColor());
                canvas.drawCircle(poid.getX(),poid.getY(), poid.getRadius(),randomColor);
            }
        }
    }

    public void addPointer(int id, float x , float y){

        try{
            this.pointerList.get(id).setAffiche(true);
        }catch (IndexOutOfBoundsException e){

            Tp04_ex01_03 poid = new Tp04_ex01_03();

            poid.setAffiche(true);
            poid.setX(x);
            poid.setY(y);
            poid.setRadius(90);
            poid.setIndice(id);

            Random r = new Random();
            poid.setColor(r.nextInt());

            pointerList.add(id,poid);
        }
        this.invalidate();
    }

    public void movePointer(int id, float x , float y){
        this.pointerList.get(id).setX(x);
        this.pointerList.get(id).setY(y);
        this.invalidate();
    }

    public void remove(int id){
        this.pointerList.get(id).setAffiche(false);
        this.invalidate();
    }

    public void removeAllPointer(int id){
        pointerList =  new LinkedList<>();
        pointerList.clear();
        this.invalidate();
    }

}
