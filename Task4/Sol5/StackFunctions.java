package Task4.Sol5;

import java.util.Scanner;
import java.util.Stack;

public class StackFunctions {
    Stack<Integer> stack = new Stack<>();

    public void pushStack(int num){
        if(stack != null) {
            stack.push(num);
            System.out.println("Pushed to stack.");
        }
    }

    public void popStack(){
        stack.pop();
        System.out.println("Popped from stack");
    }

    public void isEmpty(){
        if (stack.isEmpty()){
            System.out.println("Stack is empty!");
        }else
            System.out.println("Stack is not empty!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackFunctions main = new StackFunctions();
        String inp = "yes";
        do {
        System.out.println("\n1. Push element to stack");
        System.out.println("2. Pop element from stack");
        System.out.println("3. Check if stack is empty");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter the number to be pushed in the stack: ");
                int num = sc.nextInt();
                main.pushStack(num);
            } else if (choice == 2) {
                main.popStack();
            } else if (choice == 3) {
                main.isEmpty();
            } else
                System.out.println("Invalid input! Enter a number only from 1-3...");

            System.out.print("Do you want to continue: ");
            sc.nextLine();
            inp = sc.nextLine();

        }while (inp.equalsIgnoreCase("yes"));
    }
}