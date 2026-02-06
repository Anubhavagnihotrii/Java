package designPatterns.structural.decorator;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza mySpecialPizza;

    public PizzaDecorator(Pizza pizza) {
        this.mySpecialPizza = pizza;
    }
}
