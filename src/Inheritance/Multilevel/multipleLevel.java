package Inheritance.Multilevel;

class animal{
    void legs()
    {
        System.out.println("I have 4 legs");
    }
}
class cow extends animal{
    void food()
    {
        System.out.println("I eat grass");
    }
}
class buffalo extends cow{

}
public class multipleLevel {
    public static void main(String[] args) {
    buffalo b = new buffalo();
    b.food();
    b.legs();
    }
}
