import java.util.*;
public class relational_operators {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter a number 1 : ");
        number1=sc.nextInt();
        System.out.println("Enter a number 2 : ");
        number2=sc.nextInt();
        boolean isBig=number1>number2;
        System.out.println("Is number1 greater than number2 ? "+isBig);
        boolean isSmall=number1<number2;
        System.out.println("Is number1 less than number2 ? "+isSmall);
        boolean Equal=number1==number2;
        System.out.println("Is number1 and number2 are equal ? "+Equal);
        boolean notEqual=number1!=number2;
        System.out.println("Is number1 is not equal number 2 ? "+notEqual);
        boolean greaterThanEqualTo=number1>=number2;
        System.out.println("Is number1 is greater than equal to number2 ? "+greaterThanEqualTo);
        boolean lessThanEqualTo=number1<=number2;
        System.out.println("Is number1 is greater than equal to number2 ? "+lessThanEqualTo);
    }

}