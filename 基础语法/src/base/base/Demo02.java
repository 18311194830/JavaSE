package base.base;

/**
 * @ClassName: base.base.Demo02
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/1/30$ 16:05$
 * @Version: 1.0
 */

public class Demo02 {
    public static void main(String[] args) {
        int i = 128;
        //强制转换：（类型）变量名   高--》低
        byte b = (byte)i;
        //自动转换： 低--》高
        double d = b;


        System.out.println(i);
        //内存溢出
        System.out.println(b);
        System.out.println(d);
        /*注意点：
            1.不能对布尔值类型进行转换
            2.不能把对象类型转换为不相干的类型
            3.在把高容量转换为低容量的时候，强制转换
            4.转换的时候可能存在内存溢出，或者精度问题
         */
        System.out.println("====================================================================");
        System.out.println((int)54.5);
        System.out.println((int)-46.8f);
        System.out.println("====================================================================");
        char c = 'a';
        int i1 = c+1;
        System.out.println(i1);
        System.out.println((char)i1);
    }
}
