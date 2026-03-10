import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = String.valueOf(s.charAt(0));
        int cnt = 0;
        for(int i=1;i<s.length()-1;i++) cnt++;
        System.out.println(res+cnt+s.charAt(s.length()-1));
    }
}
