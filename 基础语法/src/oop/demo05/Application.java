package oop.demo05;

import oop.demo03.Pet;

/**
 * @ClassName: Application
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/8$ 9:45$
 * @Version: 1.0
 */

public class Application {
    //静态方法和非静态方法有很大区别
    //  静态方法：方法的调用只和左边（定义的数据类型）有关
    //  非静态方法：方法的调用只和左边（定义的数据类型）有关
    public static void main(String[] args) {
        //方法的调用只和左边（定义的数据类型）有关
        A a = new A();
        a.test();

        //父类的引用指向了子类
        B b = new A();
        b.test();
    }
}
