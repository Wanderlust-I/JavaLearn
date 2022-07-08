package com.shujia;

public class Array {
    public static void main(String_[] args) {
//  两种创建数组的方式，建议使用第一种
//        int [] arr;
//        int arr1[];
        //初始化
//        动态初始化
        int []arr=new int[5];
        arr=new int[]{1,23,4,5,3};
        int []arr2=new int[]{1,2,34,5};
        int []arr3={1,2,3,2,4};
//        for循环快捷键：fori
        //与数组的for循环快捷键：数组名.fori
//        for (int i = 0; i <=4; i++) {
//            System.out.println(arr[i]);
//        }
        for (int i = 0; i <=arr.length-1 ; i++) {
            System.out.println(arr[i]);
        }

        int max=arr[0];
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("最大值为"+max);
    }

}
