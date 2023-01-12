package class4homework;

import java.util.Scanner;

/*  Write a program to ask user to enter numbers of worked years and annual salary.
If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise
he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.*/
public class Task7WorkedYears {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How long do you work?");
        int years = input.nextInt();
        if (years >= 5) {
            System.out.println("You are eligible for the bonus");

            System.out.println("What is your annual salary?");
            int salary = input.nextInt();
            if (salary>=50000) {
                System.out.println("Your bonus is 5000$");
            } else if (salary<50000) {
                System.out.println("Your bonus is 3000$");
            }

        }else{
            System.out.println("Sorry, you're not eligible for bonus");
        }

    }
}
