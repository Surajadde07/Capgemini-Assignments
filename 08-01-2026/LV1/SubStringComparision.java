import java.util.*;

public class SubStringComparision {
    public static String compareAtChar(String s, int start, int end) {
        String res = "";

        for (int i = start; i < end; i++) {
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String first = compareAtChar(s, start, end);

        String second = s.substring(start, end);
        System.out.println("fisrt -> "+ first);
        System.out.println("second -> "+ second);

        if (first.equals(second)) {
            System.out.println("true");
            return;
        } else {
            System.out.println("false");
            return;
        }
    }
}
