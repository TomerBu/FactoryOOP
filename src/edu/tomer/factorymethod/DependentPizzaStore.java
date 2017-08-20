package edu.tomer.factorymethod;

import edu.tomer.factorymethod.chicago.ChicagoStyleCheesePizza;
import edu.tomer.factorymethod.chicago.ChicagoStyleClamPizza;
import edu.tomer.factorymethod.chicago.ChicagoStylePepperoniPizza;
import edu.tomer.factorymethod.chicago.ChicagoStyleVeggiePizza;
import edu.tomer.factorymethod.newyork.NYStyleCheesePizza;
import edu.tomer.factorymethod.newyork.NYStyleClamPizza;
import edu.tomer.factorymethod.newyork.NYStylePepperoniPizza;
import edu.tomer.factorymethod.newyork.NYStyleVeggiePizza;

public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            switch (type) {
                case "cheese":
                    pizza = new NYStyleCheesePizza();
                    break;
                case "veggie":
                    pizza = new NYStyleVeggiePizza();
                    break;
                case "clam":
                    pizza = new NYStyleClamPizza();
                    break;
                case "pepperoni":
                    pizza = new NYStylePepperoniPizza();
                    break;
            }
        } else if (style.equals("Chicago")) {
            switch (type) {
                case "cheese":
                    pizza = new ChicagoStyleCheesePizza();
                    break;
                case "veggie":
                    pizza = new ChicagoStyleVeggiePizza();
                    break;
                case "clam":
                    pizza = new ChicagoStyleClamPizza();
                    break;
                case "pepperoni":
                    pizza = new ChicagoStylePepperoniPizza();
                    break;
            }

        }


        if (pizza == null) {
            System.out.println("Error: invalid type of pizza");
            return null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}