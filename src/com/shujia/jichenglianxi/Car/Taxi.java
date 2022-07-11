package com.shujia.jichenglianxi.Car;

public class Taxi extends Car{
    private String company;
    public Taxi(String x,String y,String z){
        super(x,y);
        this.company=z;
    }
    @Override
    public void start() {
        System.out.println("乘客你好");
        System.out.println("我是"+company+"出租车公司的,"+"我的车牌是"+getLicensePlate()+",你要去哪里");
    }

    @Override
    public void end() {
        System.out.println("目的地到了，请你付费下车，欢迎下次乘坐");
    }
}
