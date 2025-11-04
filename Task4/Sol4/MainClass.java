package Task4.Sol4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {
    Map<String,Integer> maps = new HashMap<>();

    public void addStudent(String name, int grade){
        if (name != null && grade != 0) {
            maps.put(name, grade);
            System.out.println("Added successfully!");
        }
    }

    public void removeStudent(String name){
        if (maps.containsKey(name)){
            maps.remove(name);
            System.out.println("Removed successfully!");
        }else
            System.out.println("Name not found!");
    }

    public void display(String name){
        if(maps.containsKey(name)) {
            int score = maps.get(name);
            System.out.println("Grade of " + name + " is: " + score);
        }else
            System.out.println("Sorry, The given name is not present!");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MainClass main = new MainClass();
        String inp = "yes";
        do {
        System.out.println("\n1. Add a new student");
        System.out.println("2. Remove a student");
        System.out.println("3. Display students's grade by name");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter the name: ");
                String name = sc.nextLine();
                System.out.print("Enter the grade: ");
                int grade = sc.nextInt();
                sc.nextLine();
                main.addStudent(name, grade);
            } else if (choice == 2) {
                System.out.print("Enter the name to be removed: ");
                String name = sc.nextLine();
                main.removeStudent(name);
            } else if (choice == 3) {
                System.out.print("Enter the name to display the corresponding grade: ");
                String name = sc.nextLine();
                main.display(name);
           } else
                System.out.println("Invalid input! Enter a number between 1-3...");

            System.out.print("Do you want to continue: ");
            inp = sc.nextLine();

        }while (inp.equalsIgnoreCase("yes"));

    }

}

