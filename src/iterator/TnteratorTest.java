package iterator;

import java.util.HashSet;
import java.util.Iterator;

public class TnteratorTest {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
//方式一；
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String value = (String) iterator.next();
//            System.out.println(value);
//        }
        //方式二
        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            String value = (String) iterator.next();
            System.out.println(value);
        }
    }
}
