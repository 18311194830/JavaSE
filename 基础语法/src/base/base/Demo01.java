package base.base;

/**
 * @ClassName: base.base.Demo01
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/1/30$ 15:34$
 * @Version: 1.0
 */

public class Demo01 {
    public static void main(String[] args) {
        //整数拓展：进制  二进制0b  八机制0  十进制  十六进制0x
        int i = 10;
        int i2 = 010;    //八进制0
        int i3 = 0x10;   //十六进制0x，0~9 A~F 16
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("====================================================================");

        /*浮点拓展: BigDecimal 数学工具类
            float: 有限   离散  舍入误差
            double:
         */
        float f = 0.1F;
        double d = 0.1;
        System.out.println(f == d);
        System.out.println(f);
        System.out.println(d);

        float f1 = 46484564564F;
        float f2 = f1 + 1;
        System.out.println(f1 == f2);
        System.out.println("====================================================================");

        /*字符拓展：所有的字符本质还是数字

         */
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int) c1); //强制转换
        System.out.println(c2);
        System.out.println((int) c2); //强制转换

        //转义字符
        // \t制表符    \n换行
        System.out.println("Hello\tWorld");
        System.out.println("Hello\nWorld");

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1==s2);
        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println(s3==s4);

        System.out.println("====================================================================");
        /*布尔值拓展：

         */
        boolean flag = true;
        if (flag = true){}
        if (flag){}
    }
}
