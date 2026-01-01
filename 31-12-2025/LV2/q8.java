import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String fromCity = sc.next();
        String viaCity = sc.next();
        String toCity = sc.next();

        double fromToVia = sc.nextDouble();
        double viaToFinal = sc.nextDouble();
        double time = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinal;

        System.out.println(name + " travels from " + fromCity + " to " + toCity +
                " via " + viaCity + " covering distance " + totalDistance +
                " miles in " + time + " hours.");
    }
}
