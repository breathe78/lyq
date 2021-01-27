package java8.interfaceTest;

import java.util.function.Predicate;

/**
 * Author: liuyanqing
 * Date: 2020/12/7
 * Content:
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x<5;
        //Predicate<Integer> predicate1 = x -> x >3;
        System.out.println(predicate.and(x->x>3).test(5));

    }
}
