package com.shujia;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Equals {
    public static void main(String[] args) {
  String s1="131";
  String s2="131a";
        System.out.println(equalss(s1,s2));
    }
    public static boolean equalss(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false ;
        }
        for (int i = 0; i < str1.length(); i++) {
           if( str1.charAt(i)!=str2.charAt(i)){
               return false;
           }
        }
        return true;
    }
}
