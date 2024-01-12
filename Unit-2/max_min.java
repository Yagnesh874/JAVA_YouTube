import java.util.*;

class max
{
	int a,b,c;
	void getdata()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number 1 : ");
	a = sc.nextInt();
	System.out.println("Enter a number 2 : ");
	b = sc.nextInt();
	System.out.println("Enter a number 3 : ");
	c = sc.nextInt();
	}
	void display()
	{
		if(a>b && a>c)
		{
			System.out.println("A is max"+a);
		}
		else if(b>c)
		{
			System.out.println("B is max"+b);
		}
		else
		{

			System.out.println("C is max"+c);
		}
	}

}
class max_min
{
	public static void main(String args[])
	{
		max obj = new max();
		obj.getdata();
		obj.display();
	}
}