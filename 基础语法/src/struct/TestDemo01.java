package struct;

/**
 * @ClassName: TestDemo01
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/2$ 16:10$
 * @Version: 1.0
 */

public class TestDemo01 {
    public static void main(String[] args) {
        //打印三角形
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
