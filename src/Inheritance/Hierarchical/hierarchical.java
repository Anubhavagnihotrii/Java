package Inheritance.Hierarchical;

//Superclass
class Animal {
    void eat(){
    System.out.println("I eat to live or i live to eat idk lol!");
}
}

//subclass1
class dog extends Animal {
void name()
{
    System.out.println("I am Dog.");
}
}
//subclass2
class cat extends Animal{
    void name(){
        System.out.println("I am Cat.");
    }
}
public class hierarchical {
    public static void main(String[] args) {
    dog d1 = new dog();
    d1.eat();
    d1.name();  //Accessing the name method from the dog class.

    cat c1 = new cat();
    c1.eat();
    c1.name(); //Accessing the name method from the cat class.
    }
}


// Hierarchical inheritance occurs when multiple classes inherit from a single superclass.