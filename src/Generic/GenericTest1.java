package Generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lyq on 2019/10/28.
 * 1、关于自定义泛型类、泛型接口：
 */
public class GenericTest1 {

    @Test
    public void test1(){
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此类型为 Object 类型
        //要求：如果大家定义了带泛型的，建议在实例化时要指明类的泛型。
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");

        //建议：实例化时指明类的泛型
        Order<String> order1 = new Order<>("orderAA",1001,"AA");
        order1.setOrderT("AA:hello");
        System.out.println(order1);
    }
    @Test
    public void test2() {
        SubOrder subOrder = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型。则实例化字类对象时，不再需要指明泛型。
        subOrder.setOrderT(1231);

        SubOrder1<String> subOrder1 = new SubOrder1<>();
        subOrder1.setOrderT("ABC");
    }
    @Test
    public void test3() {
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = new ArrayList<>();
        //泛型不同的引用，不能相互赋值。
//        list1 = list2;
    }
    @Test
    public void test4(){
        Order<Integer> order = new Order<>();
        String[] arr = new String[]{"1","2"};
        //泛型方法在调用时，指明泛型参数的类型。
        List<String> list = order.copyFormArrayToList(arr);
        System.out.println(list);
    }

}
