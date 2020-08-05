package java8.stream;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        System.out.println(test.compute(3, item -> item + 1));
        System.out.println(test.computeCompose(3, f1 -> f1 + 1, f2 -> f2 * f2));
        System.out.println(test.computeAndThen(3, f1 -> f1 + 1, f2 -> f2 * f2));
    }

    /**
     * Function实例
     *
     * @param a
     * @param function
     * @return
     */
    public int compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    /**
     * 先走Function2，再走Function1
     *
     * @param a
     * @param f1
     * @param f2
     * @return
     */
    public int computeCompose(int a, Function<Integer, Integer> f1, Function<Integer, Integer> f2) {
        return f1.compose(f2).apply(a);
    }

    /**
     * 先走Function1,再走Function2
     * @param a
     * @param f1
     * @param f2
     * @return
     */
    public int computeAndThen(int a, Function<Integer, Integer> f1, Function<Integer, Integer> f2) {
        return f1.andThen(f2).apply(a);
    }
}
