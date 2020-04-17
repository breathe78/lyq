package Generic.mm;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyq on 2019/10/29.
 */
public class mmTest {
    public static void main(String[] args) {
        List<? extends Father> ex = new ArrayList<>();
        List<? super Son> su = new ArrayList<>();

        List<Son> sonList = new ArrayList<>();
        List<Father> fatherList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

    }
}
