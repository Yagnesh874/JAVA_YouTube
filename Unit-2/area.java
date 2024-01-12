import java.util.*;

class A
{
	int length;
	int breadth;
	int Area=0;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length : ");
		length = sc.nextInt();
		System.out.println("Enter a breadth : ");
		breadth = sc.nextInt();
	}
	void display()
	{
		Area = length * breadth;
		System.out.println("The area is : "+Area);
	}
}
class area
{
	public static void main(String[] args)
	{
	A obj = new A();
	obj.getdata();
	obj.display();
	}
}