public class DemonetizationException extends Exception {
    static final long serialVersionUID = 0x22233ff;
    int amountTried;
    DemonetizationException(int amountTried) {
        this.amountTried = amountTried;
        
    }
    public int getAmountTried(){
        return amountTried;
    }

}