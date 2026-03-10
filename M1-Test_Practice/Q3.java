import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        HashMap<Integer, Character> freq = new HashMap<>();

        char first = 'A';
        for(int i=1;i<=26;i++){
            freq.put(i,first);
            first = (char)(first+1);
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int cnt = 0;
            int j = i;
            while(j < s.length() && s.charAt(j) != '0'){
                cnt++;
                j++;
            }
            if(cnt != 0) ans += freq.get(cnt);
            i = j;
        }

        System.out.println(ans);
    }
}
