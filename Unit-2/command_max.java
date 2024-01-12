class command_max
{
	public static void main(String args[])
	{
		int a=0;
		int b=0;
		a = Integer . parseInt(args[0]);
		System.out.println(a);
		b = Integer . parseInt(args[1]);
		System.out.println(b);
		if(a>b)
		{
			System.out.println("The maximum number is : "+a);
		}
		else
		{
			System.out.println("The maximum number is : "+b);
		}
	}
}