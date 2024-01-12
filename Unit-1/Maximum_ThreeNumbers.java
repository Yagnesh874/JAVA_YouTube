import javax.swing.*;
import java.util.*;
public class Maximum_ThreeNumbers {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Enter a number 1 : ");
        number1=sc.nextInt();
        System.out.println("Enter a number 2 : ");
        number2=sc.nextInt();
        System.out.println("Enter a number 3 : ");
        number3=sc.nextInt();
        if(number1>number2){
            if(number1>number3){
                System.out.println("maximum  : "+number1);
            }
            else {
                System.out.println("Maximum : "+number3);
            }
        }
        else {
            if(number2>number3){
                System.out.println("maximum : "+number2);
            }
            else {
                System.out.println("Maximum : "+number3);
            }
        }
    }
}