import java.util.*;

public class ArrayIndexOutOfBoundsExceptionString {
    public static void generateException(){
        String[] arr = {"a","b","c","d"};
        System.out.println(arr[4]);
    }
    public static void handleException(){
        String[] arr = {"a","b","c","d"};
        try{
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException handled");
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
