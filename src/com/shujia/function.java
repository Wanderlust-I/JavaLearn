package com.shujia;

public class function {
    public static void main(String [] args) {
        int n;
        n= add(4,5);
        System.out.println(n);
        vo(1);
//        System.out.println(test(1));
    }
    public static int add(int a,int b) {
        return a+b;
    }

    public static void  vo(int x) {
        if (x == 6) {
            return;
        } else {
            System.out.println(x);
            vo(x+1);
        }
    }
//    public static int test(int x){
//        if(x==3){
//            return 0;
//        }
//        else {
//            return x+test(x+1);
//        }
//    }
}
