class Add
{
	int a,b;
	Add()
	{
		 a = 10;
		 b = 20;
	}
	Add(int a,int b)
	{
		this();
		this.a=a;
		this.b=b;
		System.out.println("Parameter constructor");
	}
	void display()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
class deafult_parameter_con
{
	public static void main(String[] args)
	{
		Add obj = new Add(11,22);
		obj.display();
	}
}