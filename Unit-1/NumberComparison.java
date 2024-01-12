import java.util.*;
public class NumberComparison {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1,number2;
        int result=0;
        System.out.println("Enter a number 1 : ");
        number1=sc.nextInt();
        System.out.println("Enter a number 2 : ");
        number2=sc.nextInt();
        if(number1>number2){
             result=number1*number2;
        }
        else {
             result=number1/number2;
        }
        System.out.println("Result is : "+result);
    }
}