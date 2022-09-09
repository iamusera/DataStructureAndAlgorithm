package com.example.datastructure.oop.inherit;

import com.example.datastructure.oop.inherit.Dog;
import com.example.datastructure.oop.inherit.Inherit;

public class TestOverride {
    public static void main(String[] args) {
        Inherit a = new Inherit(); // Animal 对象
        Inherit b = new Dog(); // Dog 对象
        Dog c = new Dog();
        Object d = new Dog();
        Dog e = new Dog();
        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
//        b.age;//去掉前注释符号，会编译错误
//        b.bark();//去掉前注释符号，会编译错误
        c.setAge(12);
        System.out.println(c.age);
        System.out.println(((Dog) d).age);
        System.out.println(e.age);
    }
}

