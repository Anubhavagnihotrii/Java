package oops.abstraction.usingabstractkeyword;

abstract class Humans{
    Humans()
    {
        System.out.println("constructor for human class created");
    }
    void myName(){
        System.out.println("My Name is Agnihotri");
    }
    abstract void myAge();
//    int x=909;
}

class Krishna extends Humans
{
    Krishna()
    {
        System.out.println("constructor for krishna class created");
    }
    @Override
    void myAge() {
        System.out.println("My age is 20");
    }
}

public class AbstractClassInJava {
    public static void main(String[] args) {
    Krishna k = new Krishna();
    k.myName();
    k.myAge();
    }
}


//Abstract class are made using the abstract keyword with the class name.
//Abstract classes can have both abstract and non-abstract both kind of methods.
//If the method is declared  abstract inside the abstract class then it shouldn't have the implementation it should contain only the declaration.
//Abstract class can be extended by the other classes and the abstract methods can be implemented there.

//Non-abstract classes or methods are also known as Concrete classes or methods.

//The class which is non-abstract can not contain the abstract method.
//Abstract methods are meant to be declared in abstract classes or interfaces.