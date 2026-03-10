import java.util.*;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        String res = "";
        for(int i=0;i<n;i++) res += s;
        System.out.println(res);
    }
}