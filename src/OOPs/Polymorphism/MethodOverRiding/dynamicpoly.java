package OOPs.Polymorphism.MethodOverRiding;
class Animal{
    void makeSound()
    {
        System.out.println("Animal Makes Sound.");
    }
}
class  dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog Barks!");
    }
}
public class dynamicpoly {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new dog(); //OOPs.Polymorphism: Dog object as an Animal reference
        a1.makeSound();       // Calls Animal's makeSound
        a2.makeSound();        // Calls Dog's makeSound (runtime polymorphism)
    }
}

//    Runtime (Dynamic) OOPs.Polymorphism:
//
//        Also known as method overriding.
//        Occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
//        The method in the subclass must have the same name, return type, and parameters (or a subtype) as the method in the superclass.
//        The decision about which method to call is made at runtime based on the actual object type.