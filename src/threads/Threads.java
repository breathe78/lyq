package threads;

public class Threads {
    public static void main(String[] args) {
        A a = new A();
        a.setName("way - 1");
        a.start();
        a.setPriority(Thread.MAX_PRIORITY);
        new Thread(new B(),"way - 2").start();
        Thread thread1 = new Thread(new B());
        thread1.setName("way - 3");
        thread1.start();
        System.out.println(Thread.currentThread());

    }
}

class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i % 2 == 0) {
                System.out.println(i + "------------------------" + Thread.currentThread());
            }
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i % 2 != 0) {
                System.out.println(i + "*********" + Thread.currentThread());
            }
        }
    }
}