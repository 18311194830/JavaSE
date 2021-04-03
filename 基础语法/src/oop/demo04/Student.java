package oop.demo04;

/**
 * @ClassName: Student
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/3/1$ 20:21$
 * @Version: 1.0
 */

public class Student extends Person {



    public Student(){
        //隐藏代码
        super();
        System.out.println("Student无参构造执行");
    }

    private String name = "niubi";

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void print(){
        System.out.println("Student");
    }


    public void test1(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
