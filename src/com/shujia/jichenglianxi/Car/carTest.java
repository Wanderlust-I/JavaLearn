package com.shujia.jichenglianxi.Car;

public class carTest {
    public static void main(String[] args) {
        Car car = new Car("车","皖A888");
        car.start();
        car.end();
        System.out.println("================");
        FamilyCar familyCar = new FamilyCar("房车", "皖A5679", "武大郎");
        familyCar.start();
        familyCar.end();
        System.out.println("================");
        Taxi taxi = new Taxi("小轿车", "京B123", "景顺");
        taxi.start();
        taxi.end();
    }
}
