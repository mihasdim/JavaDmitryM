package class5homework;
import java.util.Scanner;

public class Task4Birthday {
    public static void main(String[] args) {

       /*  Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”. */

        System.out.println("Please enter the month of your birth ");
        Scanner scan = new Scanner(System.in);
        String month = scan.next();


        if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
            System.out.println("You were born in winter");

        } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
            System.out.println("You were born in spring");

        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            System.out.println("You were born in summer");

        } else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November"))
            System.out.println("You were born in autumn");

        scan.close();
    }


    }
