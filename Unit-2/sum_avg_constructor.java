class A
{
	int n1,n2,n3,n4;
	int sum;
	int avg;
	A()
	{
		sum=0;
		avg=0;
		n1 = 0;
		n2 = 0;
		n3 = 0;
		n4 = 0;
	}
	A(int n1,int n2,int n3,int n4)
	{
		this();
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
		this.n4=n4;
	}
	void calculate()
	{
		sum = n1+n2+n3+n4;
		avg = sum/4;
		System.out.println("The sum is : "+sum);
		System.out.println("The average number is : "+avg);
	}
}
class sum_avg_constructor
{
	public static void main(String[] args)
	{
		A obj = new A(10,20,30,40);
		obj.calculate();
	}
}