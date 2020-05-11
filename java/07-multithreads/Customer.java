public class Customer extends Thread {
    protected Market m;

    Customer(Market m) {
        this.m = m;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < m.size; i++) {
            try{m.consumer();}catch(InterruptedException e){e.printStackTrace();}
        }
    }

    public static void main(String[] args) {
        
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
        Customer c = new Customer(producer);

        Thread[] threads = new Thread[] {  new Thread(producer, "Producer"),new Thread(c, "Consumer") };

        for (Thread thread : threads) {
            thread.start();
        }

        
        // System.out.println("Stay Home Stay Safe".substring(9,9));
    }
}