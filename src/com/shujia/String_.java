package com.shujia;

public class String_ {
    public static void main(String[] args) {
        String s1="111";
        String s2=new String();
        char[] char1={'1','2','1'};
        String s3=new String(char1);
        System.out.println(s3);
        System.out.println(s1.equals(s2));
        String gushi="nmmsl,sjdj/fkf,as.da/dj,asda";
        String []nmsl=gushi.split("\\||,|\\.");
        System.out.println(nmsl[1]);
        System.out.println("\"abc\\\\\\n\"");
    }
}
