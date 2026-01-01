

public class q7 {
    public static void main(String[] args) {
        int earthRadius = 6371; // in kilometers
        double pi = 3.14;
        double volume = (4.0 / 3) * pi * Math.pow(earthRadius, 3);
        System.out.println("The volume of the Earth in cubic kilometers is: " + volume + " and cubic miles is: " + (volume / 4.18));
    }
}
