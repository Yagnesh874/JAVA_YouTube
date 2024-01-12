import java.util.Scanner;
class ScannerSwap_without_third_var{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("The before swapping value is  : ");
        System.out.println("Enter a number 1 : ");
        int number1=sc.nextInt();
        System.out.println("Enter a number 2 : ");
        int number2=sc.nextInt();
        System.out.println("The after swapping values is : ");
        number1=number1+number2;//20+10 = 30
        number2=number1-number2;// 20-10 = 10
        number1=number1-number2;// 30-10 = 20
        System.out.println("number1 : "+number1);
        System.out.println("number2 : "+number2);
    }
}