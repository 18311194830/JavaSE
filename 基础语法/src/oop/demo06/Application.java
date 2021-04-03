package oop.demo06;

/**
 * @ClassName: Application
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/8$ 9:45$
 * @Version: 1.0
 */

public class Application {
    public static void main(String[] args) {

        //一个对象的实际类型是确定的
        // new A()    new B()
        //可以指向的引用类型是不确定的

        //子类可以调用的方法都是自己的或继承父类的
        B s1 = new B();
        //父类可以指向子类但是不能调用子类的方法
        A s2 = new B(); //父类的引用指向子类
        Object s3 = new B();

        //对象可以指向哪些方法，主要看对象左边的类型，和右边的关系不大
        s1.run();
        s2.run();//子类重写父类的方法，执行子类的方法。

        s1.eat();
        ((B) s2).eat();
    }
}
