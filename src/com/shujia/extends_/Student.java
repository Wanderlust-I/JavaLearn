package com.shujia.extends_;

public class Student extends Person{
    public Student() {
        System.out.println("子类的无参构造");
    }
    public Student(int x) {
        super(x);
        System.out.println("子类的有参构造");
    }
}
