import java.util.*;

public class CompareStringArray {
    public static char[] builtCharArray(char[] arr2, String s){
        for(int i=0;i<s.length();i++){
            arr2[i] = s.charAt(i);
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        char[] arr2 = new char[s.length()];

        arr2 = builtCharArray(arr2,s);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        if(Arrays.equals(arr, arr2)){
            System.out.println("true");
            return;
        }
        else{
            System.out.println("false");
        }
    }
}
