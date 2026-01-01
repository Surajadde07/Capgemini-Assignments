import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = sc.nextDouble();
        double discountPercent = sc.nextDouble();
        double discountAmount = (discountPercent/ 100) * fee;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and the final fee is INR " + finalFee);
    }
}
