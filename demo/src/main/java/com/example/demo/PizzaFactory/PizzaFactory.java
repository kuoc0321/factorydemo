package com.example.demo.PizzaFactory;

import com.example.demo.Pizza.ChicagoStylePizza;
import com.example.demo.Pizza.Pizza;

public  abstract class PizzaFactory {
    public final Pizza getPizza(String type){
        Pizza pizza = createPizza(type);
        System.out.println("Pizza Name: " + pizza.getName());
        return pizza;
    }

    protected  abstract Pizza createPizza(String type);

}
