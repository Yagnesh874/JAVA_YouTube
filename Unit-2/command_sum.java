class command_sum
{
	public static void main(String args[])
	{
		int i;
		int sum=0;
		for(i=0;i<args.length;i++)
		{
			sum = sum + Integer . parseInt(args[i]);
			System.out.println(args[i]);
		}
		System.out.println("The sum is : "+sum);
	}
}