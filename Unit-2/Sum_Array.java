import java.util.*;

public class Sum_Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size;
		int sum=0;
		System.out.println("Enter a size of array :  ");
		size = sc . nextInt();

		int[] arr = new int[size];
		int i;
		for(i=0;i<size;i++)
		{
			System.out.println("Enter array element : "+i);
			arr[i] = sc . nextInt();
		}
		for(i=0;i<size;i++)
		{
			sum+=arr[i];
		}
		System.out.println("The sum is : "+sum);
	}
}