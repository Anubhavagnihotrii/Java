package Abstraction;

interface mobiles{
    void apple();
    void redmi();
    void samsung();
}
abstract class phones implements mobiles {
    @Override
    public void apple() {
        System.out.println("I am First.");
    }
}
class myphones extends phones
{

    @Override
    public void redmi() {
        System.out.println("I am Second.");
    }

    @Override
    public void samsung() {
        System.out.println("I am Third.");
    }
}
public class InterfaceWithAbstractClass {
    public static void main(String[] args) {
    myphones mp = new myphones();
    mp.apple();
    mp.redmi();
    mp.samsung();
    }
}


//The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface.