多态
多态的优点
1. 消除类型之间的耦合关系
2. 可替换性
3. 可扩充性
4. 接口性
5. 灵活性
6. 简化性

多态存在的三个必要条件
   继承
   重写
   父类引用指向子类对象：Parent p = new Child();

Java中父类引用指向子类实例对象
1. java 中父类引用指向子类对象时动态绑定针对的只是子类重写的成员方法；

2. 父类引用指向子类对象时，子类如果重写了父类的可重写方法(非private、非 final 方法)，那么这个对象调用该方法时默认调用的时子类重写的方法，而不是父类的方法；

3. 对于java当中的方法而言，除了final，static，private 修饰的方法和构造方法是前期绑定外，其他的方法全部为动态绑定；（编译看左边,运行看右边）

本质：java当中的向上转型或者说多态是借助于动态绑定实现的，所以理解了动态绑定，也就搞定了向上转型和多态。

动态绑定和多态
https://blog.csdn.net/weixin_33816300/article/details/94086184?spm=1001.2101.3001.6650.3&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-3-94086184-blog-106452810.t5_layer_eslanding_A_0&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-3-94086184-blog-106452810.t5_layer_eslanding_A_0&utm_relevant_index=4



虚函数
虚函数的存在是为了多态。

Java 中其实没有虚函数的概念，它的普通函数就相当于 C++ 的虚函数，动态绑定是Java的默认行为。如果 Java 中不希望某个函数具有虚函数特性，可以加上 final 关键字变成非虚函数。