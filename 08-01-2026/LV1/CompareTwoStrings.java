import java.util.*;

public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String k = sc.nextLine();
        boolean first = true;
        boolean second = true;
        if(s.length() != k.length()) {
            first = false;
            return;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != k.charAt(i)){
                first = false;
                break;
            }
        }
        second = s.equals(k);

        if(first == second) System.out.println("true");
        else System.out.println("false");
    }
}
