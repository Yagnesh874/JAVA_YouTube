import javax.sound.midi.SysexMessage;
import java.util.*;
class Calculator{
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number1,number2;
        System.out.println("Enter a number 1 : ");
        number1=sc.nextInt();
        System.out.println("Enter a number 2 : ");
        number2=sc.nextInt();
        int choice;
        System.out.println("Menu : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. division");
        choice= sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("The Addition is : "+(number1+number2));
                break;
            case 2:
                System.out.println("The subtraction is : "+(number1-number2));
                break;
            case 3:
                System.out.println("The Multiplication is : "+(number1*number2));
                break;
            case 4:
                System.out.println("The division is : "+(number1/number2));
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
}