import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class cwh_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        marks[0]  = 7;
        marks[1] = 56;
        marks[2] =  6;
        System.out.println("Enter the array index : ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to the divide the value of array : ");
        int num = sc.nextInt();

        try {
            System.out.println("The value of array index entered is : "+marks[ind]);
            System.out.println("The value of array-value/number is " + marks[ind]/num);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println("Some exception occured");
            System.out.println(e);
        }
    }
}
