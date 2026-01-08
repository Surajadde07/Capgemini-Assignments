import java.util.*;

public class indexOutOfBoundException {
    public static void generateException(){
        String s = "suraj";
        System.out.println(s.charAt(5));
    }
    public static void handleException(){
        String s = "suraj";
        try{
            System.out.println(s.charAt(5));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }
    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
