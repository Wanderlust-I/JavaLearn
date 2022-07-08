package com.shujia.duixianglianxi;

public class Test {
    int x=5;
    public  void change(int x){
        this.x=x;
    }
    public static void main(String[] args) {
        int x=0;
        Test nmsl = new Test();
        nmsl.change(9);
        System.out.println(nmsl.x);
        swap(x);
        System.out.println(x);
    }

    public static void swap(int x){
        x=65;
    }
}

