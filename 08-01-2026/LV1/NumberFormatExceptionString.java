import java.util.*;

public class NumberFormatExceptionString {
    public static void generateException(){
        String str = "suraj";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
    public static void handleException(){
        String str = "suraj";
        try{
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException handled " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("RuntimeException handled ");
        }
    }
    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
