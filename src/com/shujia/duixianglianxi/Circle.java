package com.shujia.duixianglianxi;
import static java.lang.Math.PI;

public class Circle {
    int r;
    public  Circle(){}
    public Circle(int r) {
        this.r = r;
    }
    public double getArea(){
       return r*r*PI;
    }
    public double getPerimeter(){
        return 2*PI*r;
    }

}
