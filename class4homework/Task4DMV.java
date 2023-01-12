package class4homework;

import java.util.Scanner;

/* You are DMV representative, and you need to ask customer their age.
If they are 18 and older you will issue a driver licence to them, otherwise
you will offer them to get a learners permit.
*/
public class Task4DMV {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are permitted to receive the Driver's license");
        } else {
            System.out.println("Sorry, but at this moment you can get Learner's permit only");

        }

    }


}
