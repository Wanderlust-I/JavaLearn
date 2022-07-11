package com.shujia.jichenglianxi.Circle;

public class Cylinder extends Circle{
    private double hight;
    public Cylinder(){

    }
    public  Cylinder(double r,double h){
        super(r);
        this.hight=h;
    }
    double getVolume (){
        return (super.getArea()) * hight;
    }
    void showVolume(){
        System.out.println("圆柱的体积为"+getVolume());
    }

}
