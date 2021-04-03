package array;

import java.util.Arrays;

/**
 * @ClassName: ArrayDemo03
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/5$ 8:58$
 * @Version: 1.0
 */

public class ArrayDemo08 {
    public static void main(String[] args) {
        //1.创建一个二维数组 11*11，  0：无棋子   1：黑棋子   2：白棋子
        int[][] arrays = new int[11][11];
        arrays[1][2] = 1;
        arrays[2][3] = 2;
        //输出原始数组
        System.out.println("输出原始数组");
        for (int[] array : arrays) {
            for (int i : array) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        //转换为稀疏数组
        System.out.println("=================================转换为稀疏数组");
        //获取有效值个数
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("有效值个数为：" + sum);

        //创建一个稀疏数组
        int[][] array2 = new int[sum + 1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        //遍历二维数组，将非0的值存放稀疏数组
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] != 0) {
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = arrays[i][j];
                }
            }
        }
        //输出稀疏数组
        System.out.println("输出稀疏数组");
        for (int[] array : array2) {
            for (int i : array) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        //还原
        System.out.println("=================================转换为原始数组");
        //1.读取稀疏数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        //2.给其中元素还原
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        //3.输出还原数组
        System.out.println("输出还原数组");
        for (int[] array : array3) {
            for (int i : array) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }


}
