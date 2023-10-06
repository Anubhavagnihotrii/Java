package OOPs.Inheritance.Multilevel;

class Animal{
    void legs()
    {
        System.out.println("I have 4 legs");
    }
}
class Cow extends Animal{
    void food()
    {
        System.out.println("I eat grass");
    }
}
class Buffalo extends Cow{

}
public class MultipleLevel {
    public static void main(String[] args) {
    Buffalo b = new Buffalo();
    b.food();
    b.legs();
    }
}
