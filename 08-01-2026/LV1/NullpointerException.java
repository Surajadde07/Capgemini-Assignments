import java.util.*;

public class NullpointerException {
    public static void generateException(){
        String txt = null;
        System.out.println(txt.length());
    }
    public static void handleException(){
        String text = null;
        try{
            System.out.println(text.length());
        }
        catch(NullPointerException e){
            System.out.println("Nullpointer exception handled");
        }
    }
    public static void main(String[] args) {
        handleException();
    }
}
