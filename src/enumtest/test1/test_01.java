package enumtest.test1;

public enum test_01 {
    EMAIL_STATE_NOMAL(111,"新新","新"),
    EMAIL_STATE_OLD(111,"D","旧");

    private String state;
    private String msg;
    private Integer s;

    test_01(Integer s,String state, String msg) {
        this.state = state;
        this.msg = msg;
        this.s = s;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getS() {
        return s;
    }

    public void setS(Integer s) {
        this.s = s;
    }
}
