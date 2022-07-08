package com.shujia.OOP;
public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(18);
        Person s=new Person(19,"nmsl");
        s.show();
        p.show();

    }
}
