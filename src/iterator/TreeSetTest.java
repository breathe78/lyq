package iterator;


import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(new ComparatorNew());
        People p1 = new People(10);
        People p2 = new People(20);
        People p3 = new People(30);
        People p4 = new People(40);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            People value = (People) iterator.next();
            System.out.println(value.getScore());
        }

        LinkedList[] l = new LinkedList[10];
    }
}

class ComparatorNew implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        People p1 = (People) o1;
        People p2 = (People) o2;
        return p1.getScore() - p2.getScore();
    }
}