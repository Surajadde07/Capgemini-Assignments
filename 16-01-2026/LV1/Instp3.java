
class Vehicle{
    String ownerName;
    String vehicleType;
    static double registrationFee = 850.0;
    
    Vehicle (String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails(){
        System.out.println(ownerName + " " + vehicleType + " " + registrationFee);
    }

    static void updateRegistrationFee(double fee){
        registrationFee = fee;
    }
}

public class Instp3 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("suraj", "car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(12000.0);
        v1.displayVehicleDetails();
    }
}
