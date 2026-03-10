import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";

        LinkedHashSet<Character> hs = new LinkedHashSet<>();

        for(int i=0;i<s.length();i++) hs.add(s.charAt(i));
        for(char ch:hs) ans += ch;

        System.out.println(ans);

    }
}
