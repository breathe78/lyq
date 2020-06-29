package threads;

public class Threads {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        new Thread(new B()).start();
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
                System.out.println(i + "------------------------");
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
                System.out.println(i);
            }
        }
    }
}