import java.util.*;
public class arithmetic_operators {
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number 1 : ");
        int a=sc.nextInt();
        System.out.println("Enter a number 2 : ");
        int b=sc.nextInt();
        System.out.println("The addition is : "+(a+b));
        System.out.println("The subtraction is : "+(a-b));
        System.out.println("The multiplication is : "+(a*b));
        System.out.println("The division is : "+(a/b));
        System.out.println("The module is : "+(a%b));

    }
}