package Generic;


import org.junit.Test;

import java.util.*;

/**
 * Created by lyq on 2019/10/28.
 * <p>
 * 泛型的使用
 * 1、jdk 5.0新增的特性
 */
public class GenericTest {
    //在集合中使用泛型之前的情况：
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        //存放学生的成绩
        list.add(78);
        list.add(76);
        list.add(90);
        list.add(99);
        //问题一：类型不安全
        list.add("Tom");

        //输出会出现问题
        for (Object score : list) {
            //问题二：强转时，可能出现类型转换异常。
            int stuScore = (int) score;
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型：
    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(76);
        list.add(90);
        list.add(99);
        //编译时，就会进行类型检查，保证数据的安全。
        //list.add("Tom");
        //方式一
        for (Integer score : list) {
            //避免了强转操作
            int stuScore = score;
            System.out.println(stuScore);
        }

        //方式二：
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况：以HashMap为例
    @Test
    public void test3() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tom", 87);
        map.put("Jerry", 88);
        map.put("Java", 67);
        //map.put(123, "ABC");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + value);
        }
    }
}
