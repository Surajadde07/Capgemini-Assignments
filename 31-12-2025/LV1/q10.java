import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        double heightInFeet = height / 30.48;

        System.out.println("Your height in cm is " + height + " while in feet is " + heightInFeet);
    }
}
