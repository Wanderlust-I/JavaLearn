package com.shujia;

public class maopao {
    public static void main(String[] args) {
        int []arr={1,2,5,6,3,4,9};
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = 0; j <=arr.length-i-2 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int a = 0; a <arr.length ; a++) {
            System.out.println(arr[a]);
        }

    }
}
