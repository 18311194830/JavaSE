package scanner;

import java.util.Scanner;

/**
 * @ClassName: Demo01
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/2$ 9:00$
 * @Version: 1.0
 */

public class Demo04 {
    public static void main(String[] args) {
        //创建一个Scanner对象，用于接收键盘对象
        //可以输入多个数字，并求其总和与平均数，每输入一个数字使用回车确认，通过输入非数字来结束输入并输出结果
        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入多少数字
        int m = 0;
        //通过循环判断是否还有输入，并在里面进行求和统计
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m++;
            sum += x;
        }

        System.out.println(m + "个数的和为：" + sum);
        System.out.println(m + "个数的平均值为：" + (sum / m));
        //关闭
        scanner.close();
    }

}
