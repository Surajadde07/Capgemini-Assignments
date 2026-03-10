import java.util.*;

public class Q6 {
    public static boolean isPaindrome(String t){
        StringBuilder sb = new StringBuilder(t);
        String k = sb.reverse().toString();

        if(t.equals(k)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] arr = s.split(" ");
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            String t = arr[i];

            if(isPaindrome(t)) cnt++;
        }
        System.out.println(cnt);
    }
}
