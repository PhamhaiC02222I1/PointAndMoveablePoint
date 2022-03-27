package com.company;

public class Main {

    public static void main(String[] args) {
	Point point=new Point();
        System.out.println(point);

        point.setX(1);
        point.setY(3);
        System.out.println(point);

//        point.setXY(2,4);
//        System.out.println(point);

        MoveablePoint moveablePoint=new MoveablePoint();

        moveablePoint.setX(point.getX());
        moveablePoint.setY(point.getY());
        System.out.println(moveablePoint);

        moveablePoint.setxSpeed(3);
        moveablePoint.setySpeed(2);
        System.out.println(moveablePoint);

       moveablePoint.Move();
        System.out.println(moveablePoint);
    }
}
