class Book{
    String title;
    String author;
    int price;
    boolean available;

    Book(){
        System.out.println("default book");
    }
    Book(String title, String author, int price, boolean available){
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }
    
    void issueBook(String title){
        if(this.title == title && this.available == true){
            System.out.println("Available");
        }
        else{
            System.out.println("Not available");
        }
    }
}

public class p5 {
    public static void main(String[] args) {
        Book b1 = new Book("Sapiens", "nepolian", 600, true);
        b1.issueBook("fadfa");
    }
}
