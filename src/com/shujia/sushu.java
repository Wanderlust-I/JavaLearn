package com.shujia;
import java.util.Scanner;
public class sushu {
    public static void main(String_[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        boolean b=true;
for(int i=2;i<x;i++){
    if(x%i==0){
        b=false;
        break;
    }
}
if(b){
    System.out.println("是素数");
}else
{
    System.out.println("不是素数");
}
    }
}
