package struct;

/**
 * @ClassName: ForDemo01
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/2$ 15:15$
 * @Version: 1.0
 */

public class ForDemo03 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" +(i*j)+"\t");
            }
            System.out.print("\n");
        }
    }
}
