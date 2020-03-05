import static java.lang.System.out;
import java.util.Scanner;

public class StringManip1 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        String[] arr = new Scanner(System.in).nextLine().split(" ");
        System.out.println(arr[arr.length-2]);
    }
}