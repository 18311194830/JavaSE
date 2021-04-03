package oop.demo08;

/**
 * @ClassName: Student
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/3/2$ 20:28$
 * @Version: 1.0
 */
//static：类中修饰成员变量   方法中修饰成员方法
public class Student {
    private static int age;//静态变量

    private int score;

    public void run(){}

    public static void go(){}

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(Student.age);
        //System.out.println(Student.score);//报错
        System.out.println(student.age);
        System.out.println(student.score);

        Student.go();
        //Student.run(); //报错
        student.go();
        student.run();
        go();
    }
}
