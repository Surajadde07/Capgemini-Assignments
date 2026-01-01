import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weightPound = sc.nextDouble();
        double weightKg = weightPound / 2.2;

        System.out.println("The weight of the person in pound is " +
                weightPound + " and in kg is " + weightKg);
    }
}
