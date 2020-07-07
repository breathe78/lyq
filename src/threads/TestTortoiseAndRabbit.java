package threads;

public class TestTortoiseAndRabbit {
    public static void main(String[] args) {
        Tortoise tortoise = new Tortoise();
        tortoise.setName("乌龟");
        tortoise.start();
        Rabbit rabbit = new Rabbit();
        rabbit.setName("兔子");
        rabbit.start();
    }
}

/**
 * 乌龟线程
 */
class Tortoise extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 30; i++) {
            //速度
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //休息
            if (i % 10 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "跑了：" + i + "米");
        }
    }
}

/**
 * 兔子线程
 */
class Rabbit extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 30; i++) {
            //速度
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //休息
            if (i % 10 == 0) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "跑了：" + i + "米");
        }
    }
}
