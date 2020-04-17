package list;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lyq on 2019/9/24.
 */
public class demo {
    public static void main(String[] args) {
        List<Map<String, Object>> entity = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("姓名", "小明");
        map1.put("年龄", 123);
        map1.put("性别", "男");
        Map<String, Object> map2 = new HashMap<>();
        map2.put("姓名", "小红");
        map2.put("年龄", 111);
        map2.put("性别", "女");
        entity.add(map1);
        entity.add(map2);
        System.out.println(123);

    }
}
