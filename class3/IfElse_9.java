package class3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';
        if (c=='M') {
            System.out.println("Male");
        }

        String name="Sam";
        // with non-primitive data types _ String we can't use == symbol
        if(name.equals("Sam")){
            System.out.println("Amazing student");
        }
        if (!name.equals("Sam")){
            System.out.println("Super Amazing student");

        }

    }
}
