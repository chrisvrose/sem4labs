import java.util.ArrayList;

/**
 * Market
 */
public abstract class Market implements Runnable {
    /**
     * The number of elements in the market
     */
    protected int size;
    static public ArrayList<String> Fruits;
    public final static String[] fruitStrings = { "Apple", "Banana","Pomegranate", "Tomato" };

    synchronized boolean isEmpty() {
        return Fruits.size() == 0;
    }

    synchronized boolean isFull() {
        return Fruits.size() == size;
    }

    synchronized void farmer() throws InterruptedException {
        if (isFull()) {
            wait();
        }
        String someFruit = fruitStrings[(int) (Math.random() * fruitStrings.length)];
        Fruits.add(someFruit);
        System.out.format("Put(%d):%s\n", Fruits.size(), someFruit);

        notifyAll();
    }

    synchronized void consumer() throws InterruptedException {
        if (isEmpty()) {
            wait();
        }
        String getFruit = Fruits.remove(0);
        System.out.format("Get(%d):%s\n", Fruits.size(), getFruit);
        notifyAll();
    }

    public Market() {
        Fruits = new ArrayList<String>();
        size = 5;
    }

    public Market(int size) {
        Fruits = new ArrayList<String>();
        if(size==0) throw new IllegalArgumentException("0 sized basket");
        this.size = size;
    }

    
}