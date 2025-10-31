package Task3.Sol1;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        String cont = "yes";
        do {
            System.out.println("Library:");
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Search book");
            System.out.println("4. Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the Book title: ");
                String title = sc.nextLine();
                System.out.print("Enter the author name: ");
                String author = sc.nextLine();
                library.addBook(new Book(id, title, author, true));

            } else if (choice == 2) {

                System.out.print("Enter the id of the book to be removed: ");
                int id = sc.nextInt();
                sc.nextLine();
                library.removeBook(id);

            } else if (choice == 3) {

                System.out.print("Enter the book ID to search: ");
                int id = sc.nextInt();
                sc.nextLine();
                library.searchBook(id);

            } else if (choice == 4) {

                library.displayBooks();
                sc.nextLine();

            } else {
                System.out.println("Enter a number only from 1-4");
            }

            System.out.print("Do you want to continue: ");
            cont = sc.nextLine();

        }while (cont.equalsIgnoreCase("yes"));
        sc.nextLine();
        System.out.println("Program ended");
    }
}
