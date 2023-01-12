package class4homework;

import java.util.Scanner;
/*Create a Java program that will ask if user has a credit card or not.
If you user does not have a credit card then offer them. If they do have
one ask what is balance on the card? If balance of the card is larger than 1000,
tell them to pay off immediately, otherwise you can tell them that they can spend more. */
public class Task6CreditCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String card = input.nextLine();
        if (card.equals("No")) {
            System.out.println("You may apply for a credit card");

        } else if (card.equals("Yes")) {
            System.out.println("What is the balance on your card?");
            int balance = input.nextInt();
            if (balance>=1000) {
                System.out.println("Pay off immediately");
            }else{
                System.out.println("You can spend more");
            }

        }




            }
}









