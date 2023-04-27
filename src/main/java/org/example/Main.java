package org.example;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //peperoni pizza
        String[] toppingsForPeperoniPizza = {"Peperoni", "Olive"};
        Pizza peperroni_pizza = new Pizza("Peperoni", "thick bread", "tomato sauce", true, toppingsForPeperoniPizza);
        peperroni_pizza.bake();
        peperroni_pizza.serve();
        System.out.println(peperroni_pizza.toString());

        //hawaii pizza
        String[] toppingsForHawaiiPizza = {"Pineapple", "Olive", "tomatos"};
        Pizza hawaii_Pizza = new Pizza("Hawaii", "thin bread", "tomato sauce", true, toppingsForHawaiiPizza);
        hawaii_Pizza.bake();
        hawaii_Pizza.serve();
        System.out.println(hawaii_Pizza.toString());

        Pizza margherita_Pizza = new Pizza("margehrita", "thin bread", "tomato sauce", true);
        margherita_Pizza.bake();
        margherita_Pizza.serve();
        System.out.println(margherita_Pizza.toString());


    }


}