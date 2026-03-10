import java.util.*;

public class Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        ArrayList<Integer> ls = new ArrayList<>();

        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for(int i=0;i<n;i++) hs.add(arr[i]);
        for(int i:hs) ls.add(i);

        System.out.println(ls);
    }
}