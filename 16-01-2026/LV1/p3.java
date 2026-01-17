
class Person{
    int hands;
    int legs;

    Person(int h, int l){
        this.hands = h;
        this.legs = l;
    }
    Person(Person p1){
        this.hands = p1.hands;
        this.legs = p1.legs;
    }
}
public class p3 {
    public static void main(String[] args) {
        Person p1 = new Person(2, 2);
        Person p2 = new Person(p1);

        System.out.println(p2.hands);

    }
}
