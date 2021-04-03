package oop.demo06;

/**
 * @ClassName: B
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/3/1$ 20:47$
 * @Version: 1.0
 */

public class B extends A {

    @Override
    public void run() {
        System.out.println("B==>run");
    }

    public void eat(){
        System.out.println("B==>eat");
    }
}
