package scanner;

import java.util.Scanner;

/**
 * @ClassName: Demo01
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/2$ 9:00$
 * @Version: 1.0
 */

public class Demo03 {
    public static void main(String[] args) {
        //创建一个Scanner对象，用于接收键盘对象
        Scanner scanner = new Scanner(System.in);

        //接收数据
        int i =0;
        float f= 0.0f;
        System.out.println("请输入整数：");
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("输入的数据为："+i);
        }else {
            System.out.println("输入的不是整数数据");
        }

        System.out.println("请输入小数：");
        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("输入的数据为："+f);
        }else {
            System.out.println("输入的不是小数数据");
        }


        //关闭
        scanner.close();
    }

}
