import java.util.*;
public class maximum_three_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("Enter a number 1 : ");
        number1 = sc.nextInt();
        System.out.println("Enter a number 2 : ");
        number2 = sc.nextInt();
        System.out.println("Enter a number 3 : ");
        number3 = sc.nextInt();
        int max=(number1>number2)?((number1>number3)?number1:number3):((number2>number3)?number2:number3);
        System.out.println(max);
    }
}