package method;

/**
 * @ClassName: Demo03
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/3$ 10:42$
 * @Version: 1.0
 */

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int i){
        if (i==1){
            return i;
        }else {
            return i*f(i-1);
        }
    }
}
