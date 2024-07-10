package com.example.demo.PizzaFactory;

import com.example.demo.Pizza.ChicagoStylePizza;
import com.example.demo.Pizza.Pizza;

public class ChicagoStylePizzaFactory extends PizzaFactory {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("Chicago Style Pizza")){
            return new ChicagoStylePizza();
        }
        return null;
    }

}
