package staticDemo;

/**
 * Created by lyq on 2019/10/22.
 */
public class Father {
    static double fatherStaticMoney = 100;

    static {
        System.out.println("父类 - 静态代码块");
    }

    public Father() {
        System.out.println("父类 - 构造方法");
    }

    {
        System.out.println("父类 - 普通代码块");
    }

    public void running() {
        System.out.println("父类 - 方法");
    }


}
