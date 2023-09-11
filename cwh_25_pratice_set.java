import java.util.Scanner;

public class cwh_25_pratice_set
{
    static void table(int n)
    {
        for(int i = 1;i<=10;i++)
        {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
     static  void pattern(int n)
     {
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<i+1;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
    static int sumrec(int c)
    {
        if(c == 1) return 1;
        return c + sumrec(c-1);
    }
    static void pattern2(int d)
    {
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<d-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        //table(n);
        //pattern(n);
        //int x = sumrec(n);
        //System.out.println(x);
        pattern2(n);
    }
}
