package org.example;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        String[] toppingsForPeperoniPizza = {"Peperoni", "Olive"};
        Pizza peperroni_pizza = new Pizza("Peperoni", "thick bread", "tomato sauce", true,  toppingsForPeperoniPizza);
        peperroni_pizza.bake();
    }
}