package designPatterns.creational.builder;

public class  PersonBuilder {
    String name;
    String address;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }
    public Person build(){
        return new Person(this);
    }
}
