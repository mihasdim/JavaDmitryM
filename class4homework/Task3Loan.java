package class4homework;

import java.util.Scanner;

/* You are a loan specialist, and you need to ask user what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
*/
public class Task3Loan {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("What is the amount of the loan do you need?");
        int loan=input.nextInt();

        if (loan<=200000){
            System.out.println("Our bank is accepting the loan for you");
        }else{
            System.out.println("We have to reject your request");
        }





    }
}
