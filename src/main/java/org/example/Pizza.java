package org.example;

public class Pizza {

    String name;
    String bread;
    String sauce;

    boolean cheese;
    boolean readyToDeliver = false;

    String[] toppings;
    Pizza(String name,String bread, String sauce, boolean cheese, String[] toppings){
        this.name = name;
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    //overloaded constructor
    Pizza(String name,String bread, String sauce, boolean cheese) {
        this.name = name;
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    void bake() {
        System.out.println("The pizza " + this.name + "is baked. Ready to deliver.");
        readyToDeliver = true;
    }


    public String toString(){
        String cheeseOrNot;
        if(cheese) {
            cheeseOrNot = "Cheese included";
        }else {
            cheeseOrNot = "Cheese unincluded";
        }
        String myString = name +"\n" + bread + "\n" + sauce + "\n" + cheeseOrNot;
        return myString;
    }
}
