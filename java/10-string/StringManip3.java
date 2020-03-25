import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringManip3 {
    public static void main(String[] args) throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        for (String x : in.nextLine().split(in.next())) {
            out.println(x);
        }

    }
}