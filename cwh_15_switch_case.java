import  java.util.*;
public class cwh_15_switch_case {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();

        switch(age)
        {
            case 18:
                System.out.println("You are an become an adult!");
                break;
            case 23:
                System.out.println("You are an ready for a job!");
                break;
            case 65:
                System.out.println("You are ready for retired!");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        /*
        if(age>56)
        {
            System.out.println("You are experienced");
        }
        else if(age>46)
        {
            System.out.println("You are semi-experienced");
        }
        else if(age>36)
        {
            System.out.println("You are semi - semi experienced");
        }
        else
        {
            System.out.println("You are not experienced");
        }

         */
    }


}
