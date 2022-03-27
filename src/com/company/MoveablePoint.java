package com.company;

public class MoveablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MoveablePoint(){}

    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] speed=new float[2];
        speed[0]=this.xSpeed;
        speed[1]=this.ySpeed;
        return speed;
    }
    public void setSpeed(){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint exten : " +super.toString()+
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed;
    }
    public MoveablePoint Move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());

return this;
    }
}
