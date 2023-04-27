package org.example;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Pizza[] callAPizzaList = new Pizza[3];
        String[] toppingsForPeperoniPizza = {"Peperoni", "Olive"};
        callAPizzaList[0] = new Pizza("Peperoni", "thick bread", "tomato sauce", false, toppingsForPeperoniPizza); //peperoni
        String[] toppingsForHawaiiPizza = {"Pineapple", "Olive", "tomatos"};
        callAPizzaList[1] = new Pizza("Hawaii", "thin bread", "tomato sauce", true, toppingsForHawaiiPizza); //hawaii
        callAPizzaList[2] = new Pizza("margehrita", "thin bread", "tomato sauce", true); //margherita

        System.out.println(callAPizzaList[0]);

        //peperoni pizza
//        peperroni_pizza.bake();
//        peperroni_pizza.serve();
//        System.out.println(peperroni_pizza);

        //hawaii pizza
//        hawaii_Pizza.bake();
//        hawaii_Pizza.serve();
//        System.out.println(hawaii_Pizza.toString());

        Pizza margherita_Pizza = new Pizza("margehrita", "thin bread", "tomato sauce", true);
//        margherita_Pizza.bake();
//        margherita_Pizza.serve();
//        System.out.println(margherita_Pizza.toString());


    }


}