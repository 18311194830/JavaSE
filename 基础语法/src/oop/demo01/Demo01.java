package oop.demo01;

/**
 * @ClassName: Demo01
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/8$ 8:26$
 * @Version: 1.0
 */

public class Demo01 {
    public static void main(String[] args) {
        //静态方法   static
        Student.say02();

        //非静态方法
        //实例化方法 new
        Student student = new Student();
        student.say01();
    }

    //和类一起加载的
    public static void a(){}

    //类实例化之后才创建（即 new 之后才会创建该方法）
    public void b(){}
}
