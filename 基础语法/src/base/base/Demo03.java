package base.base;

/**
 * @ClassName: base.base.Demo03
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/1/30$ 16:15$
 * @Version: 1.0
 */

public class Demo03 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题

        //数字之间可以使用下划线分隔
        int money = 10_0000_0000;
        System.out.println(money);
        int year = 20;
        //内存溢出
        int total  = money*year;
        System.out.println(total);
        //默认是int类型，计算结束才进行类型转换，在转换之前就已经存在问题
        long total2 = money*year;
        System.out.println(total2);
        //计算之前先把一个数转换为long类型
        long total3 = money*(long)year;
        System.out.println(total3);
    }
}
