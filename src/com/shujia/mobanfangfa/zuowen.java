package com.shujia.mobanfangfa;

public abstract class zuowen {
    public final void write(){
        System.out.println("作文题目是<<nmsl>>");
        System.out.println("请随意发挥");
        System.out.println(zhengwen());
        System.out.println("老师打分：");
    }
    public abstract String zhengwen();
        
}
