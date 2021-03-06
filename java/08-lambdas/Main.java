import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Method: 1.Is Odd,2.Is Prime,3.Is Palindrome");
        int method = in.nextInt();
        if (method > 3 && method<0) {
            in.close();
            throw new IllegalArgumentException("Wrong method");
        }
        System.out.println("Number");
        int num = in.nextInt();

        switch (method) {
            case 1:
                System.out.println(PerformOperation.isOdd(num)?"True":"False");
                break;
                case 2:
                System.out.println(PerformOperation.checkPrime(num)?"True":"False");
                break;
                case 3:
                System.out.println(PerformOperation.isPalindrome(num)?"True":"False");
                break;
            default:
                break;
        }

        in.close();
    }
}