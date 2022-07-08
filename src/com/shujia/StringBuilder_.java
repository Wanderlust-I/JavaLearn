package com.shujia;
//String做拼接或是修改操作时会耗时和浪费空间（常量池），可以使用StringBuilder来代替
//区别：两者都可以存储字符串，String不可变，StringBuilder可变
public class StringBuilder_ {
    public static void main(String[] args) {
        String s="nmsl";
        StringBuilder sb=new StringBuilder(s);
        sb.append("22");//append可以添加任意类型的数据，都会拼接成字符串
        sb.append("00");
        sb.append(true);
        System.out.println(sb);
        StringBuilder sbb= sb.reverse();
        System.out.println(sbb);
       String sb2= sbb.toString(); //toString将stringbuilder转换为string类型
      String []re= sb2.split("u");
        System.out.println(re[0]);
    }
}
