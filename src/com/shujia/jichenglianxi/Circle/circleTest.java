package com.shujia.jichenglianxi.Circle;

public class circleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(8.0);
        circle.show();
        Cylinder cylinder = new Cylinder(8.0,6.0);
        cylinder.showVolume();
    }
}
