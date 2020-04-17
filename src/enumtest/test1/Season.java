package enumtest.test1;

import enumtest.test1.Info;

/**
 * Created by lyq on 2019/10/24.
 */
//使用Enum关键字
public enum Season implements Info{

    //1提供当前枚举类的对象，多个对象之间用“，”隔开，末尾对象“；”。
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天到了");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏天到了");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天到了");
        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("冬天到了");
        }
    };

    //声明对象的属性：private final 修饰
    private final String name;
    private final String desc;

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }


//    @Override
//    public void show() {
//
//    }
}
