package threads;

public class TestSingleSynchronized {
    public static void main(String[] args) {
        SingleRun1 singleRun1 = new SingleRun1();
        singleRun1.setName("懒汉1");
        singleRun1.start();
        SingleRun1 singleRun2 = new SingleRun1();
        singleRun2.setName("懒汉2");
        singleRun2.start();
    }
}

class SingleRun1 extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + Single1.getInstance());
        }
    }
}

class Single1 {
    //1、构造方法私有化
    private Single1() {
    }

    //2、创建single 的引用
    private static Single1 single1;

    //3、提供一个公共方法，对外暴露对象。
    public static Single1 getInstance() {
        if (single1 == null) {
            synchronized (Single1.class) {
                if (single1 == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    single1 = new Single1();
                }
            }
        }

        return single1;
    }
}
