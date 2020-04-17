package enumtest.test1;

public enum EnumDemo {

    NORTHWEST("01","西北区"),
    NORTHCHINA("02","华北区"),
    EASTCHINA("03","华东区"),
    SOUTHWEST("04","西南区"),
    SOUTHCHINA("05","华南区"),
    HUAZHONG("06","华中区"),
    NORTHEAST("07","东北区");

    private String str;

    private String realname;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    private EnumDemo(String str, String realname){
        this.str = str;
        this.realname = realname;
    }

    public static String getName(String str){
        for(EnumDemo name : EnumDemo.values()){
            if(name.getStr() == str){
                return name.realname;
            }
        }
        return null;
    }

}
