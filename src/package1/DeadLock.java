package package1;


public class DeadLock implements Runnable{
    public int flag = 1;
    private static Object object1 = new Object(),object2 = new Object();
    @Override
    public void run() {
        System.out.println("flag="+flag);
        if (flag == 1){
            synchronized (object1){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2){
                    System.out.println("1");
                }
            }
        }
        if (flag == 0){
            synchronized (object2){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object1){
                    System.out.println("0");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLock deadLock1 = new DeadLock();
        DeadLock deadLock2 = new DeadLock();
        deadLock1.flag = 1;
        deadLock2.flag = 0;
        new Thread(deadLock1).start();
        new Thread(deadLock2).start();
    }
}
