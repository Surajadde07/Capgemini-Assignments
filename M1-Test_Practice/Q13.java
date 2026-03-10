import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int u = 0;
        int l = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <='Z') u++;
            else l++;
        }
        if(u > l) System.out.println(s.toUpperCase());
        else if(l< u) System.out.println(s.toLowerCase());
        else System.out.println(s);
    }
}
