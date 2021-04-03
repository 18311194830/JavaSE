package oop.demo09;

/**
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/3/3$ 19:45$
 * @Version: 1.0
 */

public class Test {
    public static void main(String[] args) {
        //没有名字初始化类，不用将实例保存到变量中
        new Apple().eat();
    }
}

class Apple{
    public void eat(){
        System.out.println("1");
    }
}
