import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class Customer {
    static final String Menu = "0.Exit\n1.View balance\n2.Deposit\n3.Withdraw";

    public static void main(String[] args) throws InvalidAlgorithmParameterException{
        Scanner in = new Scanner(System.in);
        int c;
        Account accObj = new Account();
        while ((c = in.nextInt()) != 0) {
            switch (c) {
            case 1:
                System.out.println("Balance:" + accObj.getBalance());
                break;
            case 2:
                System.out.println("Deposit Amount:");
                c = in.nextInt();
                System.out.println("Is Old currency: 1-Y/0-N");
                boolean isOld = in.nextShort()==0?false:true;
                try{
                    System.out.println("New Balance:"+accObj.deposit(c,isOld));
                }catch(DemonetizationException e){
                    System.out.println("Cannot deposit old currency:"+e.getAmountTried());
                }
                break;
            case 3:
                System.out.println("Withdrawal amount:");
                c = in.nextInt();
                accObj.withdraw(c);
                break;
            default:
                throw new InvalidAlgorithmParameterException();
            }
        }

        in.close();
    }
}