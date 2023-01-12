package class5homework;
import java.util.Scanner;

public class Task9Calculator {
    public static void main(String[] args) {

       /*  Using scanner class create calculator.
       Allow user to enter 2 numbers and operator(+,-,*,/).
       Based on operator provide the result to user.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter operator");
        char operator = scan.next().charAt(0);
        System.out.println("Enter second number");
        int num2 = scan.nextInt();


        if (operator == '*') {
            System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));

        } else if (operator == '/') {
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));

        } else if (operator == '+') {
            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

        } else if (operator == '-') {
            System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));


        }
        scan.close();
    }
}
