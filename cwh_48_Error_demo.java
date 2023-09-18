import java.util.Scanner;

public class cwh_48_Error_demo {
    public static void main(String[] args) {
        //Syntax Error
        /*
        int a = 45
        System.out.println(a);

         */

        //Logical Error
        //Write a program to print all the prime number between 1 to 10
        for(int i=1;i<5;i++)
        {
            System.out.println(2*i+1);
        }

        //Runtime error

        int a = 1000;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Interger part of 1000 divided by k is : "+1000/k);
    }
}
