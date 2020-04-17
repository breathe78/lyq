package override;

public class Son extends Father {
    @Override
    public void say(){
        System.out.println("I ' m a son");
        super.say();
    }
}
