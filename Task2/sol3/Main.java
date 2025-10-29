package Task2.sol3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial balance: ");
        int balance = sc.nextInt();

        Account account = new Account(balance);

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance");
        System.out.print("Enter a choice :");
        int choice = sc.nextInt();

        if (choice == 1){
            System.out.print("Enter the amount to be deposited: ");
            int deposit = sc.nextInt();
            account.deposit(deposit);
        }else if (choice == 2){
            System.out.println("Enter the amount to be withdrawn: ");
            int withdrawn = sc.nextInt();
            account.withdraw(withdrawn);
        } else if (choice == 3) {
            account.balance();
        }

    }
}
