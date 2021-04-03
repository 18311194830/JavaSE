package oop.demo08;

/**
 * @ClassName: Person
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/3/1$ 20:21$
 * @Version: 1.0
 */

public class Person {
    {
        //代码块（匿名代码块）,可以用来赋初始值
        System.out.println("匿名代码块");
    }
    static {
        //静态代码块（初始化一些数据）
        System.out.println("静态代码块");
    }
    public Person(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("===========");
        Person person2 = new Person();
    }
}
