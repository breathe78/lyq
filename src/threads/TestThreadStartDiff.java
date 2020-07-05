package threads;

public class TestThreadStartDiff {
    public static void main(String[] args) throws Exception{
//        SellTicket sell = new SellTicket();
//        sell.start();
//        SellTicket sell2 = new SellTicket();
//        sell2.start();
//        SellTicket sell3 = new SellTicket();
//        sell3.start();
        SellTicket1 sellTicket1 = new SellTicket1();
        new Thread(sellTicket1).start();
        new Thread(sellTicket1).start();
        new Thread(sellTicket1).start();
    }
}

class SellTicket extends Thread {
    static int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("票已经卖完了");
                break;
            }
            System.out.println("当前"+Thread.currentThread().getName()+"剩余票"+ (--ticket));
        }
    }
}

class SellTicket1 implements Runnable {
    int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("票已经卖完了");
                break;
            }
            System.out.println("当前"+Thread.currentThread().getName()+"剩余票"+ (--ticket));
        }
    }
}
