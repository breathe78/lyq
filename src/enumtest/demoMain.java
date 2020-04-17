package enumtest;

/**
 * Created by lyq on 2019/10/24.
 */
public class demoMain {
    public static void main(String[] args) {
        //toString();
        SeaSon1 seaSon1 = SeaSon1.SPRING;
        //System.out.println(seaSon1.toString());
        //values();
//        SeaSon1[] values = SeaSon1.values();
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i]);
//        }
//        Thread.State[] threads = Thread.State.values();
//        for (int i = 0; i < threads.length; i++) {
//            System.out.println(threads[i]);
//        }
        //valueOf();
        SeaSon1 seaSon11 = SeaSon1.valueOf("SPRING");
        seaSon11.show();
        SeaSon1 seaSon12 = SeaSon1.valueOf("SUMMER");
        seaSon12.show();
    }
}
