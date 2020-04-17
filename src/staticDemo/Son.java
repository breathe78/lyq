package staticDemo;

/**
 * Created by lyq on 2019/10/22.
 */
public class Son extends Father {
    static double sonStaticMoney = 50;

    static {
        System.out.println("子类 - 静态代码块");
    }

    {
        System.out.println("子类 - 普通代码块");
    }

    public Son() {
        System.out.println("子类 - 构造方法");
    }

}
