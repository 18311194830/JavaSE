package array;

/**
 * @ClassName: ArrayDemo03
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/5$ 8:58$
 * @Version: 1.0
 */

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};
        printArray(array[0]);
        System.out.println(array[0][1]);
    }

    /**
     * 打印数组元素
     *
     * @param array
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
