import java.util.*;

class Circle{
    int radius;

    Circle(){
        this(60);
        System.out.println("this is cicle");
    }

    Circle(int r){
        this.radius = r;
    }
}


public class p2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.radius);
    }
}
