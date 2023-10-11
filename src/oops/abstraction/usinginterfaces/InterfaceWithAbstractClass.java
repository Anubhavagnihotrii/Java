package oops.abstraction.usinginterfaces;

interface Mobiles{
    void apple();
    void redmi();
    void samsung();
}
abstract class Phones implements Mobiles {
    @Override
    public void apple() {
        System.out.println("I am First.");
    }
}
class MyPhones extends Phones
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
    MyPhones mp = new MyPhones();
    mp.apple();
    mp.redmi();
    mp.samsung();
    }
}


//The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface.