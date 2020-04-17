package enumtest.test1;

public class test_01_main {
    public static void main(String[] args) {

        //toSting();
        Season demo2 = Season.SUMMER;
        System.out.println(demo2.toString());
        //values();
        Season[] values = Season.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        //线程状态
        Thread.State[] threads = Thread.State.values();
        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i]);
        }

        System.out.println(Season.SUMMER.getDesc());

    }
}
