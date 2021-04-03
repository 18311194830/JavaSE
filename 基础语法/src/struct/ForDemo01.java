package struct;

/**
 * @ClassName: ForDemo01
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/2$ 15:15$
 * @Version: 1.0
 */

public class ForDemo01 {
    public static void main(String[] args) {
        //奇数之和
        int oddSum = 0;
        //偶数之和
        int evenSum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("0-100奇数之和：" + oddSum);
        System.out.println("0-100偶数之和：" + evenSum);
    }
}
