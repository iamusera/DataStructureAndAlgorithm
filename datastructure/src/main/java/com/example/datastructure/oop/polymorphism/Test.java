package com.example.datastructure.oop.polymorphism;

public class Test {
    public static void main(String[] args) {
        show(new Cat());  // 以 Cat 对象调用 show 方法
        show(new Dog());  // 以 Dog 对象调用 show 方法

        Animal a = new Cat();  // 向上转型
        a.eat();               // 调用的是 Cat 的 eat
//        a.work();             // 父类申明变量指向子类实例，该父类变量不能调用父类不存在的变量和方法
        Cat c = (Cat)a;        // 向下转型
        Cat d = new Cat();        // 向下转型
        c.work();        // 调用的是 Cat 的 work
    }

    public static void show(Animal a)  {
//        System.out.println("show");
        a.eat();
        // 类型判断
        if (a instanceof Cat)  {  // 猫做的事情
            System.out.println("Cat obj");
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof Dog) { // 狗做的事情
            System.out.println("Dog obj");
            Dog c = (Dog)a;
            c.work();
        }
        System.out.println("-----------");
    }
}

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}
