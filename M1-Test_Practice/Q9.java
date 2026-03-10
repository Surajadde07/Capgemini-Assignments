import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            res += (char)('a' + (ch - 'a' + 3) % 26);
        }
        System.out.println(res);
    }
}
