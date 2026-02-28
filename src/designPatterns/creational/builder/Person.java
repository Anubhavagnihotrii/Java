package designPatterns.creational.builder;

public class Person {
    String name;
    String address;

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.address = builder.address;
    }
    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
       Person p1 = Person.builder().name("anubhav").address("blr").build();
        System.out.println(p1.toString());
    }
}
