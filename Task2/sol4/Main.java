package Task2.sol4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your Employee ID: ");
        int empId = sc.nextInt();
        System.out.print("Enter your salary amount: ");
        int empSal = sc.nextInt();

        Employee employee= new Employee(name, age, empId, empSal);
        employee.display();
    }
}
