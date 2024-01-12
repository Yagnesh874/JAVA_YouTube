import java.util.*;

public class factorial
{
	public static int factorial_number(int number)
	{
		int fact=1;
		int i;
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter a number to find the factorial : ");
		number = sc . nextInt();
		int product = factorial_number(number);
		System.out.println("The factorial number is : " + product);
	}
} 