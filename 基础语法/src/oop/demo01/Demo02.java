package oop.demo01;

/**
 * @ClassName: Demo02
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/8$ 8:38$
 * @Version: 1.0
 */

public class Demo02 {
    public static void main(String[] args) {
        //int add = add02(1, 2);
        int add02 = Demo02.add02(1, 2);
        System.out.println(add02);

        //形参一一对应和实参要
        Demo02 demo02 = new Demo02();
        int add01 = demo02.add01(1, 2);
        System.out.println(add01);
    }

    public int add01(int a,int b){
        return a+b;
    }

    public static int add02(int a,int b){
        return a+b;
    }
}
