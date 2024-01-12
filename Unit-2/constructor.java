class A
{
	int a;
	String name;
	A()
	{
		a=10;
		name="world";
	}
}
class constructor 
{
	public static void main(String[] args)
	{

		A obj = new A();
		System.out.println("The number is : " + obj.a);
		System.out.println("The name is : " + obj.name);
	}	
}

