package override;

public class main {
    public static void main(String[] args) {

        Father f = new Son();
        Son s = new Son();
        f = s;
        f.say();
    }
}
