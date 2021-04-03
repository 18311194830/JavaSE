package oop.demo07;

import java.util.Date;

/**
 * @ClassName: Application
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/8$ 9:45$
 * @Version: 1.0
 */

public class Application {
    public static void main(String[] args) {
        //类型之间的转换
        Person obj = new Student();
        //将obj转换为Student类型，使用Student类型的方法
        ((Student) obj).go();

        //子类转换为父类会丢失子类本身的方法
        Student student = new Student();
        student.go();
        student.run();
        Person person = student;  //父类的引用指向子类的对象
        ((Student) person).go();
        person.run();
    }
}
