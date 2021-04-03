package exception.demo01;

/**
 * @ClassName: MyException
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/3/3$ 20:37$
 * @Version: 1.0
 */

public class MyException extends Exception {
    //传递数字>10
    private int detail;

    public MyException(int a){
        this.detail=a;
    }

    //异常打印信息
    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
