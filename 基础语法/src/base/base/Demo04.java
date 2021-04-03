package base.base;

/**
 * @ClassName: base.base.Demo04
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/1/30$ 16:36$
 * @Version: 1.0
 */

public class Demo04 {
    //属性：变量
    //实例变量：从属于对象,如果不进行初始化，这个类型有默认值
    String name;
    int age;
    //类变量：static
    static double salary=18000;

    //main方法
    public static void main(String[] args) {
        //局部变量:必须声明和初始化
        int i = 10;
        System.out.println(i);

        //实例变量
        Demo04 demo04 = new Demo04();
        System.out.println(demo04.age );
        System.out.println(demo04.name);

        //类变量
        System.out.println(salary);

    }

    //其他方法
    public void add(){}
}
