import java.util.*;

class Book {
    String title;
    String author;
    int price;

    Book(){
        System.out.println("this is book");
    }
    Book(int p){
        this.price = p;
    }
    
}

public class p1 {
    public static void main(String[] args) {
        Book l = new Book(60);
        System.out.println(l.price);
    }
}
