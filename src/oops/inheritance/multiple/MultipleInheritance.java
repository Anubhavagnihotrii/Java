package oops.inheritance.multiple;

// Java supports multiple inheritance through interfaces. A class can implement multiple interfaces.
// Interface names start with an uppercase letter by convention.

interface Animal {
    void name();
    String food();
    int legs();
}

interface House {
    void houseOfAnimal();
}

class Cow implements Animal, House {
    // Implementing the methods from the Animal interface
    @Override
    public void name() {
        System.out.println("I am a cow.");
    }

    @Override
    public String food() {
        return "Grass";
    }

    @Override
    public int legs() {
        return 4;
    }

    // Implementing the method from the House interface
    @Override
    public void houseOfAnimal() {
        System.out.println("I live in Gaushala.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.name();
        System.out.println(c.food());
        System.out.println(c.legs());
        c.houseOfAnimal();
    }
}
