package class4;

public class IfDemo1 {
    public static void main(String[] args) {

        int money=1500;

        if(money>1000){
            System.out.println("Lets buy an IPhone");
        }
        if(money>2000){

            System.out.println("Lets buy an Macbook");
        }
        boolean mothersDay=true;
        if(mothersDay);{
            System.out.println("Happy mothers day");
        }

        String name="Sardar";
        // equals method is ONLY used for non-primitives
        if(name.equals("Sardar")){
            System.out.println("I love football");
        }

    }
}
