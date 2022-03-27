package com.company;

public class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point(){}

    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] Poi1=new float[2];
        Poi1[0]=this.x;
        Poi1[1]=this.y;
        return Poi1;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point has " +
                "x=" + x +
                ", y=" + y
                ;
    }
}
