package struct;

/**
 * @ClassName: ForDemo01
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/2/2$ 15:15$
 * @Version: 1.0
 */

public class ForDemo02 {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                System.out.print("\n");
            }
        }
    }
}
