package method;

/**
 * @ClassName: Demo02
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/3$ 10:25$
 * @Version: 1.0
 */

public class Demo02 {
    public static void main(String[] args) {
        printMax(45,879,9,3,54);
        printMax(new double[]{1,2,3,5,8});
    }

    public static void printMax(double...numbers){
        if (numbers.length==0){
            System.out.println("参数为空");
            return;
        }
        double result = numbers[0];
        //排序
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>result){
                result=numbers[i];
            }
        }
        System.out.println("最大值为："+result);

    }
}
