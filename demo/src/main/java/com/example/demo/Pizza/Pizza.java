package com.example.demo.Pizza;

import java.security.ProtectionDomain;
import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;

    protected ArrayList<String> toppings = new ArrayList<String>();


    public String getName() {
        return name;
    }



}
