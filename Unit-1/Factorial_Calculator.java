import java.util.*;
public class Factorial_Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number;
        int fact=1;
        int i=1;
        System.out.println("Enter a number to find a factorial : ");
        number=sc.nextInt();
        do {
            fact=fact*i;
            i++;
        }while(i<=number);
        System.out.println("The factorial is : "+fact);
    }
}