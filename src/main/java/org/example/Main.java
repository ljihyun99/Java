package org.example;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Delivery delivery = new Delivery();

        Pizza[] callAPizzaList = new Pizza[3];

        String[] toppingsForPeperoniPizza = {"Peperoni", "Olive"};
        callAPizzaList[0] = new Pizza("Peperoni", "thick bread", "tomato sauce", false, toppingsForPeperoniPizza); //peperoni
        callAPizzaList[0].bake();
        delivery.needToBeDelivered(callAPizzaList[0]);

        String[] toppingsForHawaiiPizza = {"Pineapple", "Olive", "tomatos"};
        callAPizzaList[1] = new Pizza("Hawaii", "thin bread", "tomato sauce", true, toppingsForHawaiiPizza); //hawaii

        callAPizzaList[2] = new Pizza("margehrita", "thin bread", "tomato sauce", true); //margherita

//        for(Pizza pizza:callAPizzaList) {
//            System.out.println(pizza.name);
//        }




    }


}