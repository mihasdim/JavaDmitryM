package class6;

public class LocalNotDemo {
    public static void main(String[] args) {

        System.out.println(false);
        System.out.println(!false);
        boolean condition=!true;
        System.out.println(condition);

        String password="hhhhhh";
        if(!password.equals("Pass123")){
            System.out.println("Wrong password");
        }

        boolean isRaining=true;

        if(!isRaining){
            System.out.println("lets go for a walk");
        }else {
            System.out.println("let take the umbrella");

        }

    }
}