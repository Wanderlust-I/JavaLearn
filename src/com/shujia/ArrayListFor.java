package com.shujia;
import java.util.ArrayList;
public class ArrayListFor {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList();
        list.add("java");
        list.add("hello");
        list.add("world");
        list.add("test");
        list.add("show");
        list.add("show");
        list.add("show");
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i);

            if(s.equals("java")){
sum++;
            }
        }
    }
}
