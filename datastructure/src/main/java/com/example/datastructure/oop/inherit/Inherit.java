package com.example.datastructure.oop.inherit;

/* oop 继承 重写 重载 */
public class Inherit {
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog extends Inherit {
    public int age=10;
    public void move(){
        age = 10;
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
    public void setAge(int age){
        this.age = age;
    }
}

