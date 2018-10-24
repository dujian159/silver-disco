public class Main {

    public static void main(String[] args) {
        Account account = new Account(3000);

       Customer customer = new Customer(account);

       Thread thread1 = new Thread(customer);
        thread1.setName("甲");
        Thread thread2 = new Thread(customer);
        thread2.setName("乙");
        thread1.start();
        thread2.start();
    }

}
class Account{
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public synchronized void setBalance(double money){
        notify();
        try {
            Thread.currentThread().sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance += money;
        System.out.println(Thread.currentThread()+":账户余额："+balance);
        try{
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
class Customer implements Runnable{
    Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            account.setBalance(1000);

        }
    }
}