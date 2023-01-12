package class6homework;

public class Task1Loop {
    public static void main(String[] args) {
        /* 1) write a loop to print numbers from 1 to 100
           2) write a loop to print odd numbers from 1 to 15
           3) write a loop to print these number 5,10,15,20,25,30.... 50 */

        int number=1;
        while (number<=100) {
            System.out.print(number+" ");
            number++;

        }
        System.out.println("");
        System.out.println("******************");

        int number1 = 1;
        while (number1 <= 15) {
            if (number1 % 2 != 0)
                System.out.print(number1+" ");
            number1++;
            }
        System.out.println("");
            System.out.println("******************");

            int number2=5;
            while (number2<=50) {
                if (number2%5 ==0)
                    System.out.print(number2+ " ");
                number2++;
            }

        }
    }

