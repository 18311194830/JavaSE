package array;

/**
 * @ClassName: ArrayDemo01
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/3$ 15:32$
 * @Version: 1.0
 */

public class ArrayDemo01 {
    public static void main(String[] args) {
        //静态初始化：创建 + 赋值
        int[] a = {1,2,3};
        System.out.println(a[1]);
        //动态初始化:包含默认初始化
        int[] b = new int[10];
        b[0] = 1;
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[9]);
    }
}
