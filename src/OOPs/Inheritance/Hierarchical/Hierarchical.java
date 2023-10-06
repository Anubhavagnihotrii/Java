package OOPs.Inheritance.Hierarchical;

//Superclass
class Animal {
    void eat(){
    System.out.println("I eat to live or i live to eat idk lol!");
}
}

//subclass1
class Dog extends Animal {
void name()
{
    System.out.println("I am Dog.");
}
}
//subclass2
class Cat extends Animal{
    void name(){
        System.out.println("I am Cat.");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.eat();
    d1.name();  //Accessing the name method from the dog class.

    Cat c1 = new Cat();
    c1.eat();
    c1.name(); //Accessing the name method from the cat class.
    }
}


// Hierarchical inheritance occurs when multiple classes inherit from a single superclass.