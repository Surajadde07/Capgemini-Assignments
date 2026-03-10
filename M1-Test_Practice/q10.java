import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int[] res = new int[n];
        int zeros = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0) zeros++;
        }
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                res[j] = arr[i];
                j++;
            }
        }

        while(zeros > 0){
            res[j] = 0;
            j++;
            zeros--;
        }

        for(int i=0;i<n;i++){
            System.out.print(res[i] + " ");
        }
    }
}
