package com.example.demo;

import com.example.demo.Pizza.ChicagoStylePizza;
import com.example.demo.PizzaFactory.ChicagoStylePizzaFactory;
import com.example.demo.PizzaFactory.PizzaFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(FactoryDemoApplication.class, args);
		PizzaFactory chicagoStylePizzaFactory = new ChicagoStylePizzaFactory();
		chicagoStylePizzaFactory.getPizza("Chicago Style Pizza");


	}

}
