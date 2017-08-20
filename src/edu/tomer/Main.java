package edu.tomer;

import edu.tomer.factorymethod.chicago.ChicagoPizzaStore;
import edu.tomer.factorymethod.newyork.NYPizzaStore;


import edu.tomer.simplefactory.Pizza;
import edu.tomer.simplefactory.PizzaStore;
import edu.tomer.simplefactory.SimplePizzaFactory;

public class Main {

    public static void main(String[] args) {
        simpleFactoryTest();

        //factoryMethodTest();
    }

    private static void factoryMethodTest() {
        //namespace collisions...
        edu.tomer.factorymethod.PizzaStore nyStore = new NYPizzaStore();
        edu.tomer.factorymethod.PizzaStore chicagoStore = new ChicagoPizzaStore();

        edu.tomer.factorymethod.Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

    private static void simpleFactoryTest() {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }

}