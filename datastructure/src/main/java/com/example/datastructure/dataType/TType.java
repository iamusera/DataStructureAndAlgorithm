package com.example.datastructure.dataType;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

public class TType <T>{
    private final T  key;
    public TType(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }
    public T getKey(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }
    public static void main(String[] args) {
        System.out.println("泛型测试 类型相同");
    }
}
