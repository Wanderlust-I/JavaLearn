package com.shujia;
import java.util.Random;
public class random {
    public static void main(String_[] args) {
        Random r=new Random();
        for(int i=1;i<100;i++)
        {
//            int x=r.nextInt(10);
            System.out.println(r.nextInt(10));
        }
    }
}
