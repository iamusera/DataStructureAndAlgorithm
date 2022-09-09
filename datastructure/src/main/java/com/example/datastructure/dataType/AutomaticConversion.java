package com.example.datastructure.dataType;


import lombok.var;

public class AutomaticConversion {

    public static void main(String[] args) {
        int i = 1231111111;
        char c1 = 22;
        char c2 = 'c';
        byte b = 2;

        // automatic conversion
        int n = b;
        long l = i;

        System.out.println(n);
        System.out.println(l*1000);

        // cast
        int ii =22;
        long L = 33;
        char c = (char) ii;
        int nn = (int) L;

        System.out.println("c: " + c);
        System.out.println("nn: " + nn);

        // Implicit conversion 隐含转换
        byte bb = 1;
        int ccc = 2;
        byte  aaa = (byte) ccc;
    }
}
