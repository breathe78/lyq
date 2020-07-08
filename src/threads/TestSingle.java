package threads;

public class TestSingle {
    public static void main(String[] args) {
        SingleRun thread1 = new SingleRun();
        thread1.setName("单例1 - 懒汉1");
        thread1.start();

        SingleRun thread2 = new SingleRun();
        thread2.setName("单例2 - 懒汉2");
        thread2.start();
    }
}

class SingleRun extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + Single.getInstance());
        }
    }
}

class Single {
    //1、构造方法私有化
    private Single() {
    }

    //2、创建single 的引用
    private static Single single;

    //3、提供一个公共方法，对外暴露对象。
    public static Single getInstance() {
        if (single == null) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            single = new Single();
        }
        return single;
    }
}