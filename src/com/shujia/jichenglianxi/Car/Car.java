package com.shujia.jichenglianxi.Car;
/*
*2.	请使用面向对象的思想，设计自定义类，描述出租车和家用轿车的信息。
设定
1)	出租车类:
属性包括：车型，车牌，所属出租公司；方法包括：启动，停止
2)	家用轿车类：
属性包括：车型，车牌，车主姓名；方法包括：启动，停止
要求
1)	分析出租车和家用轿车的公共成员，提取出父类—汽车类
2)	利用继承机制，实现出租车类和家用轿车类
3)	编写测试类，分别测试汽车类，出租车类和家用轿车类对象的相关方法
4)	定义名为car的包存放汽车类，出租车类，家用轿车类和测试类

* */
public class Car {
private String vehicleType;
private String licensePlate;
    public Car(String vehicleType, String licensePlate) {
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
    }
    public  void start(){
    System.out.println("我是"+vehicleType+"我启动");
}
public void end(){
    System.out.println("我是"+vehicleType+"我停止");
}
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
