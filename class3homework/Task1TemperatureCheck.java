package class3homework;

/*  Create a Java program and name it Temperature Check. Create variable to store temperature.
Your program should check if temperature is below 32 then it should print “Water will freeze with
temperature ”, otherwise “Water will NOT freeze with temperature ”.
*/
public class Task1TemperatureCheck {
    public static void main(String[] args) {

        int temp=25;

        if (temp<=32) {
            System.out.println("Water will freeze with temperature " +temp+ " F");
        }else{
            System.out.println("Water will NOT freeze with temperature "+temp+ " F");


        }

    }

}
