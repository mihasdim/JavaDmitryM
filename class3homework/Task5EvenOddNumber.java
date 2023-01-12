package class3homework;

import java.util.Scanner;

/* Write a Java Program to check whether number is Even or Odd */
public class Task5EvenOddNumber {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        System.out.println("Please enter a number to determine if the number is Even or Odd");
        int number=input.nextInt();
        if (number%2 == 0){

            System.out.println("The number "+number+" is Even");

        } else if (number%2 != 0) {

            System.out.println("The number "+number+" is Odd");

        }

    }
}
