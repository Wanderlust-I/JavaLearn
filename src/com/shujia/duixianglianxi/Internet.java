package com.shujia.duixianglianxi;

public class Internet {
    int password,id;
    String email;
    public Internet(int id, int password) {
        this.id = id;
        this.password = password;
        this.email=this.id+"@gameschool.com";
    }
    public Internet(int id, int password,String email ) {
        this.id = id;
        this.password = password;
        this.email=email;
    }
    public void show(){
        System.out.println(this.id);
        System.out.println(this.password);
        System.out.println(this.email);
    }
}
