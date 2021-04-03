package scanner;

import java.util.Scanner;

/**
 * @ClassName: Demo01
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/2$ 9:00$
 * @Version: 1.0
 */

public class Demo01 {
    public static void main(String[] args) {
        //创建一个Scanner对象，用于接收键盘对象
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方法接收：");

        //判断用户是否输入字符串
        if (scanner.hasNext()) {
            //使用next方法接收
            String str = scanner.next();
            System.out.println("输入内容为：" + str);
        }
        //关闭
        scanner.close();
    }

}
