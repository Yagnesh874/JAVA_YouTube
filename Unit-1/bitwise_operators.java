import javax.sound.midi.SysexMessage;
import java.util.*;
public  class bitwise_operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter a number 1 : ");
        number1=sc.nextInt();
        System.out.println("Enter a number 2 : ");
        number2=sc.nextInt();
        //Bitwise AND Operator
        int resultAnd=number1 & number2;
        System.out.println("Bitwise and : "+resultAnd);
        //Bitwise Or Operator
        int resultOr=number1 | number2;
        System.out.println("Bitwise or : "+resultOr);
        //Bitwise XOR Operator
        int resultXor=number1 ^ number2;
        System.out.println("Bitwise or : "+resultXor);
        //Bitwise NOT Operator
        int resultNotOperand=number1 ^ number2;
        System.out.println("Bitwise or : "+resultNotOperand);


    }
}