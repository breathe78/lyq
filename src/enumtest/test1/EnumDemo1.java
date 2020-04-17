package enumtest.test1;

import java.util.stream.Stream;

public enum EnumDemo1 {
    STATUS_NEGATIVE_ONE(-1,"无状态"),
    STATUS_1(1,"审核中"),
    STATUS_2(2,"审核通过"),
    STATUS_3(3,"审核拒绝"),
    STATUS_4(4,"取消充值");



    private String value;
    private Integer code;

    EnumDemo1(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
