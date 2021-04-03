package oop.demo01;

/**
 * @ClassName: Demo04
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/8$ 8:52$
 * @Version: 1.0
 */

//引用传递：对象，本质还是指传递
public class Demo04 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        change(person);
        System.out.println(person.name);

    }

    public static void change(Person person) {
        person.name = "任宏腾";
    }
}

class Person {
    String name;
}
