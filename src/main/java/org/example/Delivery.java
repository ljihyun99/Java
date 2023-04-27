package org.example;

public class Delivery {
    void needToBeDelivered(Pizza pizza) {
        if(pizza.readyToDeliver) {
            System.out.println(pizza.name + " is ready to be delivered.");
        }
    }
}
