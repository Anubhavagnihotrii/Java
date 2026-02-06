package designPatterns.structural.decorator;

public class PlainPizza implements Pizza{
    @Override
    public String description() {
        return "Plain pizza";
    }

    @Override
    public int price() {
        return 10;
    }
}
