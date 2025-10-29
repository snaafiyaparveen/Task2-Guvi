package Task2.sol2;

import java.util.Scanner;

public class ProductMain {
    public static int calculateAmount(Product[] products){
        int total = 0;
        for (Product product : products) {
            total += product.price * product.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details: ");
        for (int i = 0 ; i < products.length ; i++) {
            System.out.print("Enter the products ID: ");
            int id = sc.nextInt();
            System.out.print("Enter the price: ");
            int price = sc.nextInt();
            System.out.print("Enter the products quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(id, price, quantity);
            products[i] = product;
        }

        System.out.println("Total amount spent: " + calculateAmount(products));

        Product highest = products[0];
        for (int i = 0; i < products.length ; i++) {
            if (products[i].price < highest.price) {
                highest = products[i];
            }
        }
        System.out.println("The ID of the products with highest price: " + highest.pId);

        //System.out.println("Total amount spent: " + calculateAmount(products));
    }
}
