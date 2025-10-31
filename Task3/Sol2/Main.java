package Task3.Sol2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Details: ");
        System.out.println("Enter employee ID, Name, Salary: ");
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.calcTax();

        System.out.println("Product Details: ");
        System.out.println("Enter product ID, price, quantity");
        int pid = sc.nextInt();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        Product product = new Product(pid, price, quantity);
        product.calcTax();

    }
}
