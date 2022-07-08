package com.shujia.OOP;

public class student {
     private  int  age;
   private String name;
   //在idea中getter和setter快捷键alt+insert 接着要选择多个可以shift从第一个到最后一个 中间全选
   // 或ctrl一个个选中
//    public void setAge(int age){
//        if(age>18&&age<25){
//            this.age=age;
//        }else{
//            this.age=0;
//        }
//    }
//    public  void setName(String name){
//        this.name=name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public String getName(){
//        return name;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
