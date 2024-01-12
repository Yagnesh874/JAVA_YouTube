import java.util.*;

public class sum_function
{
	public static int sumOfTwoNumber(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number 1 : ");
		int number1 = sc.nextInt();
		System.out.println("Enter a number 2 : ");
		int number2 = sc.nextInt();
		int sum = sumOfTwoNumber(number1,number2);
		System.out.println(sum);
	}
}