import java.util.*;

public class ListManip implements Comparator<String> {

    final static String menu = "0.Exit\n1.Menu\n2.Add color\n3.To Array\n4.Reverse\n5.Sublist\n6.Sort\n7.Clone";

    public int compare(String x, String y) {
        return x.compareTo(y);
    }

    public static void main(String[] args) throws InputMismatchException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println(menu);
        int c;
        while ((c = in.nextInt()) != 0) {
            switch (c) {
            case 1:
                System.out.println(menu);
                break;
            case 2:
                list.add(in.next());
                break;
            case 3:
                System.out.println(String.join(",", list.toArray(new String[100])));
                break;
            case 4:
                Collections.reverse(list);
                System.out.println(String.join(",", list));
                break;
            case 5:
                System.out.println(String.join(",", list.subList(in.nextInt(), in.nextInt() + 1)));
                break;
            case 6:
                list.sort(new ListManip());
                break;
            case 7:
                System.out.println( String.join(",",(ArrayList<String>)list.clone()) );
                break;

            }
        }

        in.close();
    }
}