package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
//        Object[] arr = c.toArray();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
