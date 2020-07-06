package threads;

public class ThreadTest5 {
    public static void main(String[] args) {
        DaemonDemo demo = new DaemonDemo();
        demo.setDaemon(true);
        demo.start();
        for (int i = 0; i <= 100; i++) {
            System.out.println("做饭。。");
        }
    }
}

/**
 * 守护线程
 */
class DaemonDemo extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("正在聊天...");
        }
    }
}
