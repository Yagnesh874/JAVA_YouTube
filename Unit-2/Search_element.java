import java.util.*;

public class Search_element
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array : ");
		int size = sc . nextInt();
		int[] number = new int[size];
		int i;
		for(i=0;i<size;i++)
		{
			System.out.println("Enter the array element : "+i);
			number[i] = sc . nextInt();
		}
		System.out.println("Enter a search element : ");
		int search = sc . nextInt();
		int flag=0;
		for(i=0;i<size;i++)
		{
			if(number[i]==search)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("The element not found");
		}
		else
		{
			System.out.println("The index number is : "+i);
		}
	}
}