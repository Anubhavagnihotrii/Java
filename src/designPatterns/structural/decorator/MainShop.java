package designPatterns.structural.decorator;

public class MainShop {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.description() + " " + pizza.price());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.description() + " " + pizza.price());
    }
}
