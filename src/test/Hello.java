package test;

import com.sun.crypto.provider.HmacPKCS12PBESHA1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Hello {
    public static final int a = 12;
    public static void main(String[] args) {

        Map map1 = new HashMap<>();
        map1.put(1, "a");
        map1.put(2, "a");

        Map map2 = new HashMap<>();
        map2.put(2, "a");
        map2.put(1, "a");

        System.out.println(map1.equals(map2));


    }
}
