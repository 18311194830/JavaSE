package oop.demo01;

/**
 * @ClassName: Demo03
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/8$ 8:46$
 * @Version: 1.0
 */

public class Demo03 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);

        Demo03.change(a);
        System.out.println(a);
    }

    public static void change(int a){
        a=10;
    }
}
