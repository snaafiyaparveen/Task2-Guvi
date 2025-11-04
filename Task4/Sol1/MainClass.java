package Task4.Sol1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException {
        Scanner sc = new Scanner(System.in);
        int rollNo;
        String name;
        int age;
        String course;
        System.out.print("Enter your Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the course: ");
        course = sc.nextLine();
        try{
            student stu = new student(rollNo,name,age,course);
            stu.display();
        } catch (NameNotValidException e) {
            throw new RuntimeException(e);
        } catch (AgeNotWithinRangeException e) {
            throw new RuntimeException(e);
        }

    }
}
