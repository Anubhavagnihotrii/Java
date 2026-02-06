package designPatterns.structural.decorator;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String description() {
        return mySpecialPizza.description()+ ", Cheese";
    }

    @Override
    public int price() {
        return mySpecialPizza.price() + 5;
    }
}
