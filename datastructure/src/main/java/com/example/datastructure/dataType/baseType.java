package com.example.datastructure.dataType;

public class baseType {
    static Integer x = 1;
    static int y = 2;

    public baseType() {

    }
//    @Override
//    public baseType clone() throws CloneNotSupportedException {
//        return (baseType)super.clone();
//    }

//    @Override
//    protected baseType clone() throws CloneNotSupportedException {
//        return (baseType) super.clone();
//    }
    @Override
    protected baseType clone() throws CloneNotSupportedException {
        baseType result = (baseType) super.clone();

        return result;
    }

    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        Integer c = 1;

        int d = 1;
        int e = 1;

        System.out.println(y);
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);
        System.out.println(a.equals(b));
        /*
        == 是操作符，equals是方法。
        对于基本类型变量来说，只能使用 == ，因为基本类型的变量没有方法。使用==比较是值比较。
        对于引用类型的变量来说，==比较的两个引用对象的地址是否相等。所有类都是继承objcet类，
        而object类是equals方法比较的也是对象的地址是否相等，如果类没有重写equals方法，使用 == 和equals方法效果是一样的。
        String类重写了equals方法，首先判断地址是否一致，如果是返回true，代码如下
        */

        Integer f = Integer.valueOf(1);
        Integer g = Integer.valueOf(1);
        System.out.println(f==g);
        switch (g){
            case 11: System.out.println("g is 11");
            case 1:  System.out.println("g is 11");
        };
        /* switch 不支持 long、float、double，是因为 switch 的设计初衷是对那些只有少数几个值的类型进行等值判断，
        如果值过于复杂，那么还是用 if 比较合适。 */
        g = 11;
        if(g == 11){ System.out.println(g.intValue());}
        if(g == 11){ System.out.println(g.floatValue());}
        final int aa = 1;
//        final A y = new A(1);
//        y.a = 1;
    }
}

