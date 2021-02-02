package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: liuyanqing
 * Date: 2021/2/1
 * Content:
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] strArr = new String[5];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = (i + 1 + "");
        }
        Arrays.stream(strArr).forEach(System.out::print);

    }
}
