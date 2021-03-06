package com.shujia.jichenglianxi.Monster;
/*
* 3.	某公司要开发新游戏，请用面向对象的思想，设计游戏中的蛇怪和蜈蚣精
设定
1)	蛇怪类:
属性包括：怪物名字，生命值，攻击力
方法包括：攻击，移动（曲线移动），补血（当生命值<10时，可以补加20生命值）
2)	蜈蚣精类：
属性包括：怪物名字，生命值，攻击力
方法包括：攻击，移动（飞行移动）
要求
1)	分析蛇怪和蜈蚣精的公共成员，提取出父类—怪物类
2)	利用继承机制，实现蛇怪类和蜈蚣精类
3)	攻击方法，描述攻击状态。内容包括怪物名字，生命值，攻击力
4)	编写测试类，分别测试蛇怪和蜈蚣精的对象及相关方法
5)	定义名为mon的包存怪物类，蛇怪类，蜈蚣精类和测试类

* */
public class Monster {
    private  String name;
    private  int ph;
    private int agressivity;

    public Monster(String name, int ph, int agressivity) {
        this.name = name;
        this.ph = ph;
        this.agressivity = agressivity;
    }

    public void attack(){
        System.out.println("怪物"+name+"展开攻击");
    System.out.println("当前生命值："+ph);
    System.out.println("攻击力是："+agressivity);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    public int getAgressivity() {
        return agressivity;
    }

    public void setAgressivity(int agressivity) {
        this.agressivity = agressivity;
    }
}
