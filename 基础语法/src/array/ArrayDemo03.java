package array;

/**
 * @ClassName: ArrayDemo03
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/5$ 8:58$
 * @Version: 1.0
 */

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("===============");
        printArray(array);
        System.out.println("===============");
        printArray(reverse(array));
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

    /**
     * 反转数组
     * @param array
     * @return
     */
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            result[j] = array[i];
        }
        return result;
    }
}
