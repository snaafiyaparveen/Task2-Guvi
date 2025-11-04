package Task4.Sol3;

import java.util.ArrayList;
import java.util.Scanner;

public class WeekdaysInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> weekdays = new ArrayList<>();
        weekdays.add("Sunday");
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");

        System.out.print("Enter index of the day to be displayed: ");
        int index = sc.nextInt();
        try{
            System.out.println(weekdays.get(index));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
