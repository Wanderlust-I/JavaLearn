package com.shujia.jichenglianxi.Monster;


public class Snake extends Monster{
    public Snake(String name, int ph, int agressivity) {
        super(name, ph, agressivity);
    }

    public void move(){
        System.out.println("我是蛇怪，走s型路线");
    }
    public void addph(){
        setPh(getPh()+20);
        System.out.println("施展大蛇补血术。。。。。，当前生命值为:"+getPh());
    }
}
