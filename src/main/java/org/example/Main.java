package org.example;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws IOException {

//        Delivery delivery = new Delivery();
//
//        Pizza[] callAPizzaList = new Pizza[3];
//
//        String[] toppingsForPeperoniPizza = {"Peperoni", "Olive"};
//        Pizza peperoni_pizza = new Pizza("Peperoni", "thick bread", "tomato sauce", false, toppingsForPeperoniPizza); //peperoni
//        peperoni_pizza.eat();
//        callAPizzaList[0] = peperoni_pizza;
//        System.out.println("total number of Pizzas in order: "+ Pizza.totalNumOfPizzaInOrder);
//        callAPizzaList[0].bake();
//        delivery.needToBeDelivered(callAPizzaList[0]);
//        System.out.println("total number of Pizzas in order: "+Pizza.totalNumOfPizzaInOrder);


        try {
            FileReader reader = new FileReader("src/main/java/org/example/pizza.txt");
            int data = reader.read();
            while (data != -1) {
            System.out.print((char)data);
                data = reader.read();
            }reader.close();
            }catch(FileNotFoundException e){
                System.out.println("File not found.");
            }catch(Exception e){
                System.out.println("Something went wrong.");
            }
        }


//        String[] toppingsForHawaiiPizza = {"Pineapple", "Olive", "tomatos"};
//        Pizza hawaiiPizza= new Pizza("Hawaii", "thin bread", "tomato sauce", true, toppingsForHawaiiPizza); //hawaii
//        callAPizzaList[1] = hawaiiPizza;
//        Pizza margheritaPizza= new Pizza("margehrita", "thin bread", "tomato sauce", true); //margherita
//        callAPizzaList[2] = margheritaPizza;

//        for(Pizza pizza:callAPizzaList) {
//            System.out.println(pizza.name);
//        }




    }

