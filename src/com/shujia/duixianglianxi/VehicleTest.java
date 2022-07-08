package com.shujia.duixianglianxi;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car=new Vehicle();
         car.setSpeed(50);
        System.out.println(car.getSpeed());
        car.speedDown();
        car.speedDown();
        car.speedDown();
        car.speedDown();
        car.speedDown();
        System.out.println(car.getSpeed());
    }
}
