package array;

import java.util.Arrays;

/**
 * @ClassName: ArrayDemo03
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/5$ 8:58$
 * @Version: 1.0
 */

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[] array = {4, 7, 294, 23, 7, 236, 123};
        System.out.println(Arrays.toString(sort(array)));
    }

    /**
     * 冒泡排序
     * 1.比较数组中两个相邻的元素，如果第一个数比第二个数大，就交换他们的位置
     * 2.每一个比较都会产生一个最大或最小的元素
     * 3.下一轮则可以少一次排序；
     * 4.依次循环直到结束。
     *
     * @param array
     */
    public static int[] sort(int[] array) {
        //外层循环，判断轮询次数
        for (int i = 0; i < array.length - 1; i++) {
            //内层循环，比较判断两个数，若第一个数比第二个数大，则交换位置
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
