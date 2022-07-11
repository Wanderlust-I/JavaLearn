package com.shujia.jichenglianxi.Car;

public class FamilyCar extends Car{
    private String carName;
    public FamilyCar(String x, String y,String z) {
        super(x,y);
        this.carName=z;
    }
    @Override
    public void start() {
        System.out.println("我是"+carName+",我的汽车我做主");
    }

    @Override
    public void end() {
        System.out.println("目的地到了，我们去玩吧");
    }
}
