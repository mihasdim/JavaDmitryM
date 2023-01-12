package class5homework;
import java.util.Scanner;

public class Task3Scores {
    public static void main(String[] args) {

       /*  Write a program that will read three inputs of scores (quiz, mid term, and final scores)
       and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Please input quiz score ");
        double quiz=scan.nextDouble();
        System.out.println("Please input mid term score");
        double midTerm=scan.nextDouble();
        System.out.println("Please input final score");
        double finalScore=scan.nextDouble();
        double average=(quiz+midTerm+finalScore)/3;
        System.out.println("Your average score is "+average);

        if (average>=90) {
            System.out.println("Congratulations!!! Your grade is ---A");

        } else if (average>=70 && average<90) {
            System.out.println("Your grade is ---B");

        } else if (average>=50 && average<70) {
            System.out.println("Your grade is ---C");
        }else {
            System.out.println("Your grade is ---F");
        }
        scan.close();


    }
}
