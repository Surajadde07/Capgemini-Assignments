import java.util.*;

public class IllegalArgumentExceptionString {
    public static void generateException(){
        String s = "suraj";
        System.out.println(s.substring(5,3));
    }
    public static void handleException(){
        String s = "suraj";
        try{
            System.out.println(s.substring(5,3));
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException handled");
        }
        catch(RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }
    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
