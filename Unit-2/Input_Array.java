import java.util.*;

public class Input_Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array : ");
		int size = sc . nextInt();
		int[] a = new int[size];
		int i;

		//input of the array

		for(i=0;i<size;i++)
		{
			System.out.println("Enter array elemets : "+i);
			a[i] = sc . nextInt();
		}

		//Print the array
		
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}