import java.util.*;

class CarRental{
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(){
        System.out.println("Default constructor");
    }
    CarRental(String name, String model, int days){
        customerName = name;
        carModel = model;
        rentalDays = days;
        int totalCost = 100 * rentalDays;
        System.out.println("the total cost is "+ totalCost);
    }
}
public class p6 {
    public static void main(String[] args) {
        CarRental honda = new CarRental("parth", "honda",1);

    }
}
