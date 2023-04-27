package org.example;

public class Pizza {

    String name;
    String bread;
    String sauce;

    boolean cheese;

    String[] toppings;
    Pizza(String name,String bread, String sauce, boolean cheese, String[] toppings){
        this.name = name;
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    void bake() {
        System.out.println("Bake the pizza: " + this.name);
    }

    void serve(){
        System.out.println("Serve the pizza: "+ this.name);
    }
}
