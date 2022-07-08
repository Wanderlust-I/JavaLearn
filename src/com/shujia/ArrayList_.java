package com.shujia;

import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList <String> s=new ArrayList();
        s.add("2");
        s.add("5");
        s.add("5");
        s.add("5");
        s.add("5");
        System.out.println(s);
        s.remove("2");
        System.out.println(s);
        String ss=s.remove(0);
        System.out.println(ss);
        String sb=s.get(0);
        System.out.println(sb);
       s.set(0, "222");
        System.out.println(s);
        System.out.println(s.size());
    }
}
