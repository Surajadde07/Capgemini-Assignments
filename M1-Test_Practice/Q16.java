import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(x >= 0) ls.add(x);
        }

        int size = ls.size();
        int mid;
        if(size % 2 == 0) mid = (size/2) - 1;
        else mid = size/2;

        System.out.println(ls.get(mid));
    }
}
