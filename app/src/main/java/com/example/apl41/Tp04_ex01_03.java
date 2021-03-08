package com.example.apl41;

//Poid
public class Tp04_ex01_03 {

    private float x;
    private float y;
    private float radius;

    private int color;

    private boolean affiche;
    private int indice;

    public Tp04_ex01_03(){

        this.radius = 90;
        this.x = this.y = -this.radius;
        this.color = 0;
        this.affiche = false;
        this.indice = -1;
    }

    // --- geter ---
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getRadius() {
        return radius;
    }

    public int getColor() {
        return color;
    }

    public boolean getAffiche(){
        return affiche;
    }

    public int getIndice() {
        return indice;
    }

    // --- seter ---
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setAffiche(boolean affiche) {
        this.affiche = affiche;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

}
