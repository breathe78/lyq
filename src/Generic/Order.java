package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyq on 2019/10/28.
 */
public class Order<T> {
    String orderName;
    int orderId;
    //类的内部结构就可以使用类的泛型
    T orderT;

    public Order() {
    }

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
    //静态方法中不能使用类的泛型
    //因为泛型实在实例化调用的时候起作用，静态方法加载早于实例化。
//    public static void show(T orderT) {
//        System.out.println(orderT);
//    }

    public void show() {
        //编译不通过
    }
//        try {
//
//        } catch (T t) {
//
//        }
//    }

    //泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系。
    //换句话说，泛型方法所属的是不是泛型类都没有关系。
    //泛型方法，可以声明为静态的。原因：泛型参数时在调用方法时确定的。并非实例化类时确定。
    public <T> List<T> copyFormArrayToList(T[] arr) {
        ArrayList<T> list = new ArrayList<>();
        for (T e : arr) {
            list.add(e);
        }
        return list;
    }
}
