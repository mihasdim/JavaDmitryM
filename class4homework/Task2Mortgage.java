package class4homework;
/* Create a Java program and store values of mortgage rate and mortgage price.
First, program should check if rate is higher than 4.5 user will not buy a house,
otherwise user will consider buying. Once user decides to buy a house, if price
of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
*/
public class Task2Mortgage {

    public static void main(String[] args) {
        double rate= 3.5;
        int price= 300000;

        if (rate>4.5) {
            System.out.println("Rate is too high and user will not buy the house");

        } else {
            System.out.println("User will consider buying the house");

            if (price > 200000) {
                System.out.println("User will take a loan");

            } else {
                System.out.println("User will pay in cash");


            }
        }


    }
}
