package com.example.demo.Pizza;


import com.example.demo.PizzaFactory.PizzaFactory;

public class ChicagoStylePizza extends Pizza {
    public ChicagoStylePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra thick crust dough";
        sauce = "Tomato sauce";
        toppings.add("Mozzarella Cheese");
    }


    @Override
    public String getName() {
        return name;
    }
}
