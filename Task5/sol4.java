package Task5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class sol4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthdate(yyyy-mm-dd): ");
        String a = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(a, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate date = LocalDate.now();

        Period age = Period.between(birthDate, date);

        System.out.println("Your age is: " + age.getYears() +" years, " + age.getMonths() + " months, " + age.getDays() + " days.");


    }
}
