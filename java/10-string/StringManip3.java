import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringManip3 {
    public static void main(String[] args) throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sentence");
        String line = in.nextLine();
        System.out.println("Enter delimiter");
        String[] parts = line.split(in.next());
        for (String x : parts) {
            out.println(x);
        }
        in.close();
    }
}