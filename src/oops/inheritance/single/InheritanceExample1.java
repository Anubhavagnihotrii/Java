package oops.inheritance.single;

//Single OOPs.Inheritance

class Animal{
    void speak()
    {
        System.out.println("Animals have there own language");
    }
}
class Horse extends  Animal
{

}
public class InheritanceExample1 {
    public static void main(String[] args) {
    Horse h = new Horse();
    h.speak();
    }
}
