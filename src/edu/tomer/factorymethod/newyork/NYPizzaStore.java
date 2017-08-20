package edu.tomer.factorymethod.newyork;

import edu.tomer.factorymethod.Pizza;
import edu.tomer.factorymethod.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		switch (item) {
			case "cheese":
				return new NYStyleCheesePizza();
			case "veggie":
				return new NYStyleVeggiePizza();
			case "clam":
				return new NYStyleClamPizza();
			case "pepperoni":
				return new NYStylePepperoniPizza();
			default:
				return null;
		}
	}
}