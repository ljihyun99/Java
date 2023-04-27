package org.example;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Delivery delivery = new Delivery();

        Pizza[] callAPizzaList = new Pizza[3];

        String[] toppingsForPeperoniPizza = {"Peperoni", "Olive"};
        Pizza peperoni_pizza = new Pizza("Peperoni", "thick bread", "tomato sauce", false, toppingsForPeperoniPizza); //peperoni
        peperoni_pizza.eat();
        callAPizzaList[0] = peperoni_pizza;
        System.out.println("total number of Pizzas in order: "+ Pizza.totalNumOfPizzaInOrder);
        callAPizzaList[0].bake();
        delivery.needToBeDelivered(callAPizzaList[0]);
        System.out.println("total number of Pizzas in order: "+Pizza.totalNumOfPizzaInOrder);

//        String[] toppingsForHawaiiPizza = {"Pineapple", "Olive", "tomatos"};
//        Pizza hawaiiPizza= new Pizza("Hawaii", "thin bread", "tomato sauce", true, toppingsForHawaiiPizza); //hawaii
//        callAPizzaList[1] = hawaiiPizza;
//        Pizza margheritaPizza= new Pizza("margehrita", "thin bread", "tomato sauce", true); //margherita
//        callAPizzaList[2] = margheritaPizza;

//        for(Pizza pizza:callAPizzaList) {
//            System.out.println(pizza.name);
//        }




    }


}