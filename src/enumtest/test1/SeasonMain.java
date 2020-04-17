package enumtest.test1;

/**
 * Created by lyq on 2019/10/24.
 */

import enumtest.test1.Season;

/**
 * 1、创建枚举类
 * <p>
 * 2、Enum类中的常用方法：
 * toString():返回当前枚举类对象常量的名称
 * values()方法：返回枚举类型的对象数组。该方法可以很方便的遍历多有的枚举值。
 * valueOf(String str)：可以把一个字符串转为对应的枚举对象。要求字符串的名称和枚举类对象名称一致。
 * <p>
 * 3、使用enum关键字定义的枚举类实现接口的情况
 * 情况一：实现接口，在enum类中实现抽象方法
 * 情况二：让枚举类的对象分别实现接口中的方法
 */
public class SeasonMain {

    public static void main(String[] args) {
        Season season = Season.SUMMER;
        //toString()方法
        System.out.println(season.toString());
        //values()方法
        Season[] seasons = Season.values();
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
        //valueOf():返回枚举中对象名称是objName的对象。
        Season winter = Season.valueOf("WINTER");
        System.out.println(winter);
        //实现接口
        Season summer = Season.valueOf("SUMMER");
        summer.show();
        Season autumn = Season.valueOf("AUTUMN");
        autumn.show();
    }
}
