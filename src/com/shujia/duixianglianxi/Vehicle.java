package com.shujia.duixianglianxi;

public class Vehicle {
    private int speed,size;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void speedUO() {
        this.speed ++;
    }
    public void speedDown() {
        this.speed --;
    }
}
