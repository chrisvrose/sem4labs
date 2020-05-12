import java.util.Scanner;

public class Customer extends Thread {
    protected Market m;

    protected int times;
    Customer(Market m,int times) {
        this.m = m;
        this.times = times;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i <times; i++) {
            try{m.consumer();}catch(InterruptedException e){e.printStackTrace();}
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fruits to get?");
        int times = in.nextInt();
        Market producer = new Market() {
            @Override
            public void run() {
                try {
                    for (;;) {
                        farmer();
                        //wait(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Customer c = new Customer(producer,times);

        Thread[] threads = new Thread[] {  new Thread(producer, "Producer"),new Thread(c, "Consumer") };

        for (Thread thread : threads) {
            thread.start();
        }

        in.close();

        
        // System.out.println("Stay Home Stay Safe".substring(9,9));
    }
}