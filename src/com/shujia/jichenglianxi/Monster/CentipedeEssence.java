package com.shujia.jichenglianxi.Monster;


public class CentipedeEssence extends Monster{
    public CentipedeEssence(String name, int ph, int agressivity) {
        super(name, ph, agressivity);
    }

    public void move(){
        System.out.println("我是蜈蚣精，御风飞行");
    }
}
