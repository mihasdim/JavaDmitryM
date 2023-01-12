package class5homework;
import java.util.Scanner;

public class Task7Country {
    public static void main(String[] args) {

       /*  7) Ask user to enter their country and capture it.
       Once values are captured print which language user speaks.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter country to find out native language");
        String country=scan.nextLine();

        switch (country){
            case "Russia":
                System.out.println("Your language is Russian");
                break;

            case "Ukraine":
                System.out.println("Your language is Ukrainian");
                break;

            case "Australia":
                System.out.println("Your language is English");
                break;

            case "Germany":
                System.out.println("Your language is German");
                break;

            case "Brazil":
                System.out.println("Your language is Portuguese");
                break;

            default:
                System.out.println("Country didn't provided in list");



        }

        scan.close();
    }

}
