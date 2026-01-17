
class HotelBooking{
    String guestName;
    String roomType;
    int nights;

    HotelBooking(){
        System.out.println("Default constructor");
    }
    HotelBooking(String name, String room, int night){
        guestName = name;
        roomType = room;
        nights = night;
    }
    HotelBooking(HotelBooking h1){
        this.guestName = h1.guestName;
        this.roomType = h1.roomType;
        this.nights = h1.nights;
    }
}

public class p4 {
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking("suraj","two",3);
        HotelBooking h2 = new HotelBooking(h1);
        System.out.println(h2.nights);
    }
}
