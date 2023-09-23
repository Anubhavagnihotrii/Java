package OOPs.Abstraction;

interface activity{

   void sound();

    void eat();

    final  int xyz=5;
}
class dog implements activity{
    @Override
    public void sound() {
        System.out.println("Dog's Always Bark's");
    }

    @Override
    public void eat() {
        System.out.println("Dog's eat pedigree");
    }
}


public class interfacesInJava {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.eat();

        System.out.println(activity.xyz);


        Human h1 = new Human();
        h1.sex();
        h1.sound();
//       h1.eat();  this wouldn't print anything as we didn't define it in the class Person.
    }
}


// Interfaces in java are used to achieve OOPs.Abstraction and Multiple OOPs.Inheritance.

// All the methods inside the Interface are declared with empty body, and all the fields are public, static and final by default.

// A class that implements an interface must implement all the methods declared in the interface.

//The Java compiler adds public and abstract keywords before the interface method. Moreover, it adds public, static and final keywords before data members.


interface person extends  activity{
   void sex();
}
//The Above is person named Interface which is extending a Voice Interface, So this shows that a one interface can extend the other interface.
class Human implements person{

    @Override
    public void sex() {
        System.out.println("I can be MALE FEMALE OTHER");
    }

    @Override
    public void sound() {
        System.out.println("I have a normal Voice");
    }

    @Override
    public void eat() {

    }
}

//interface finalInterfaceBanaDtaHun extends activity,person{
//    void fixHaiFinal();
//}
// A interface can perform multiple inheritance in java but a class can't because the class contains the method implementation which can cause the diamond problem(ambiguity error) to occur while interfaces only have the method declarations (Interfaces do not provide the implementations).


/*
     I can also write  MultiLine comments like this. :(

 */

//Final keyword is used to make something constant which the user can't modify, if u want the variable to modify re-declare and init or use the constructor.
//And the last thing ,if a variable is declared inside the interface we can directly access that variable using dot operator using the name of the interface.

//One more thing, There are nested Interfaces too. :(

//we can also declare static methods inside the interface but for that we need to define them too.
//When the method is static then, we does not need to make the object of the class or instantiate the class we can directly call the function with class name and dot operator and the name of the function.