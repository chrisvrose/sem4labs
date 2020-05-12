import java.util.*;
import java.util.stream.Collectors;

public class ListManip implements Comparator<String> {

    final static String menu = "0.Exit\n1.Menu\n2.Add color\n3.To Array\n4.Reverse\n5.Sublist\n6.Sort\n7.Clone\n8.Display";

    public int compare(String x, String y) {
        return x.compareTo(y);
    }

    public static void main(String[] args) throws InputMismatchException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println(menu);
        int c=1;
        while (c != 0) {
            System.out.println("Enter option:");
            c = in.nextInt();
            switch (c) {
                case 0:
                break;
            case 1:
                System.out.println(menu);
                break;
            case 2:
                list.add(in.next());
                break;
            case 3:
                System.out.println("Size of array:");
                int size = in.nextInt();
                System.out.println(String.join(",", list.toArray(new String[size])));
                break;
            case 4:
                Collections.reverse(list);
                System.out.println(String.join(",", list));
                break;
            case 5:
                System.out.println("from and to indices");
                int from = in.nextInt();
                int to = in.nextInt();
                System.out.println(String.join(",", list.subList(from,to)));
                break;
            case 6:
                list.sort(new ListManip());
                break;
            case 7:
                System.out.println( String.join(",",(ArrayList<String>)list.clone()) );
                break;
            case 8:
                System.out.println(list.stream().collect(Collectors.joining(",")));
            }
        }

        in.close();
    }
}