package Task4.Sol2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the voter ID number: ");
        int voterId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        Voter voter = null;
        try {
            voter = new Voter(voterId,name,age);
        } catch (InvalidVotingAge e) {
            throw new RuntimeException(e);
        }
        voter.display();
    }
}
