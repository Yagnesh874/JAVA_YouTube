import java.util.*;

public class Product
{
	public static int CalculateProduct(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a number 1 : ");
		int number1 = sc . nextInt();
		System.out.println("Enter a number 2 : ");
		int number2 = sc . nextInt();

		int multiplication = CalculateProduct(number1,number2);
		System.out.println("The product of two value is : " +multiplication);
	}
}