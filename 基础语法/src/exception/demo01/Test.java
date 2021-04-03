package exception.demo01;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: 任宏腾
 * @CreateDate: 2021/3/3$ 20:39$
 * @Version: 1.0
 */

public class Test {
    static void test(int a) throws MyException {
        if (a > 10) {
            throw new MyException(a);
        }

        System.out.println("OK");
    }

    public static void main(String[] args) {
        /*try {
            test(11);
        } catch (MyException e) {
            System.out.println(e);
        }*/
        String[] s = {"a","b","c"};
        Stream<String> stream = Stream.of(s);

        String s1 = stream.collect(Collectors.joining(",", "[", "]"));
        //String s2 = stream.collect(Collectors.joining("|", "", ""));
        //String s3 = stream.collect(Collectors.joining("=>", "", "]"));

        System.out.println(s1);
       // System.out.println(s2);
        //System.out.println(s3);

    }
}
