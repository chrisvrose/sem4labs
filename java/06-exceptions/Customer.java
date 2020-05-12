import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class Customer {
    static final String Menu = "0.Exit\n1.View balance\n2.Deposit\n3.Withdraw";

    public static void main(String[] args) throws InvalidAlgorithmParameterException {
        Scanner in = new Scanner(System.in);
        int c = 1;
        Account accObj = new Account();
        System.out.println(Menu);
        while (c != 0) {
            System.out.println("Enter option");
            c = in.nextInt();
            switch (c) {
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    System.out.println("Balance:" + accObj.getBalance());
                    break;
                case 2:
                    System.out.println("Deposit Amount:");
                    c = in.nextInt();
                    System.out.println("Is Old currency: 1-Y/0-N");
                    boolean isOld = in.nextShort() == 1 ? true : false;
                    try {
                        System.out.println("New Balance:" + accObj.deposit(c, isOld));
                    } catch (DemonetizationException e) {
                        System.out.println("Cannot deposit old currency:" + e.getAmountTried());
                    }
                    break;
                case 3:
                    System.out.println("Withdrawal amount:");
                    c = in.nextInt();
                    System.out.println("Withdrew:"+ accObj.withdraw(c));
                    break;
                default:
                    throw new IllegalArgumentException("Invalid input");
            }
        }

        in.close();
    }
}