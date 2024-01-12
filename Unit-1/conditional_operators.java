import java.util.*;
public class conditional_operators {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number 1 : ");
        int number1=sc.nextInt();
        System.out.println("Enter a number 2 : ");
        int number2=sc.nextInt();
        //Conditional (Ternary) Operator
        int maximum=(number1>number2)?number1:number2;
        System.out.println("The maximum is : "+maximum);
        //Logical AND Operator
        boolean bothPositive=(number1>0)&& (number2>0);
        System.out.println("The positive number is : "+bothPositive);
        //Logical  OR Operator
        boolean anyPositive=(number1>0)||(number2>0);
        System.out.println("Is either positive number : "+anyPositive);
        //Logical NOT Operator
        boolean notOperand1 = !(number1 > 0);
        System.out.println("Is operand1 not positive? " + notOperand1);

    }
}