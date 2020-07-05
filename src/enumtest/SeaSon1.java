package enumtest;


/**
 * Created by lyq on 2019/10/24.
 */
public enum SeaSon1 implements demoInterFace {
    SPRING("春天","春天到了"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天","夏天到了"){
        @Override
        public void show() {
            System.out.println("去春天家了");
        }
    },
    AUTUMN("秋天","秋天到了"){
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天","冬天到了"){
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    private String name;
    private String value;

    SeaSon1(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SeaSon1{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

//    @Override
//    public void show() {
//        System.out.println("一年有四个季节");
//    }
}
