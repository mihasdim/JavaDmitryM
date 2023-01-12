package class5homework;
import java.util.Scanner;

public class Task5LargestNumber {
    public static void main(String[] args) {

       /*  Write a program to find largest of three double values using if-else..if
       and logical operators provided by a user (numbers must be distinct)*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter three numbers ");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
        double num3=scan.nextDouble();
        

        if (num1>num2 && num1>num3) {
            System.out.println("First number "+num1+ " is largest");

        } else if (num2>num1 && num2>num3) {
            System.out.println("Second number "+num2+ " is largest");

        }else if (num3>num1 && num3>num2) {
            System.out.println("Third number "+num3+ " is largest");

        }

        scan.close();
    }

}
