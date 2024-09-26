package application;
import java.util.*;

import entities.Product;

public class Program {
    
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.printf("Name:");
        String name = teclado.nextLine();
        System.out.printf("Price:");
        double price = teclado.nextDouble();
        Product x = new Product(name, price);

        x.setName("Computer");
        System.out.println("Update name: " + x.getName());
        x.setPrice(1200);
        System.out.println("Updated price: " + x.getPrice());

        System.out.println();
        System.out.println("Product data: " + x);

        System.out.println();
        System.out.printf("Enter the number of products to be added in stock:");
        int quantity = teclado.nextInt();
        x.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + x);

        System.out.println();
        System.out.printf("Enter the number of products to be removed from stock:");
        quantity = teclado.nextInt();
        x.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + x);

        teclado.close();

    }
   
}
