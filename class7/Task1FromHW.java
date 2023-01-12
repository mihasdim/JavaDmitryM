package class7;

public class Task1FromHW {
    public static void main(String[] args) {
        boolean workDay=true;
        int day=10;
        while (day<8){
            if (day<=5){
                System.out.println("I need a day off");
            }else{
                System.out.println("I don't need a day off");
                workDay=false; // needs for stop loop on the other hand we can get the infinite loop
            }
            day++; // it is equal to day= day=day+1 day+=1
        }



    }
}
