package com.example.datastructure.oop.polymorphism;
/*
多态存在的三个必要条件
1. 继承
2. 重写
3. 父类引用指向子类对象：Parent p = new Child();
*/
public class Shape {
    void draw() {
        System.out.println("Shape.draw()");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle.draw()");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square.draw()");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle.draw()");
    }
}