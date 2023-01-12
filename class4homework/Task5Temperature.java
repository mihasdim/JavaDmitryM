package class4homework;

/* Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius, and print “The temperature is the city  is ”
*/

import java.util.Scanner;
public class Task5Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your city?");
        String city= input.nextLine();
        System.out.println("What is the temperature in your city in Fahrenheits?");
        float temp = input.nextFloat();
        System.out.println("The temperature in "+city+ " is "+ ((temp-32)*5/9) +" Celsius");

    }
}
