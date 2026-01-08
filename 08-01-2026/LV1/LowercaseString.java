import java.util.*;

public class LowercaseString {
    public static String toLowerCaseString(String s){
        String res = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int val = (int)ch + 32;
            res += (char)val;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String first = toLowerCaseString(s);
        String second = s.toLowerCase();
        System.out.println("first -> "+ first + " second -> "+second);
        if(first.equals(second)){
            System.out.println("true");
            return;
        }
        else{
            System.out.println("false");
            return;
        }
    }
}
