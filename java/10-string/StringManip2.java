import static java.lang.System.out;
import java.util.Scanner;

public class StringManip2 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        System.out.println(new Scanner(System.in).nextLine().toLowerCase().replace("python", "_")
                .replace("java", "python").replace("_", "java"));
    }
}