import java.util.*;

public class cwh_24_Recursion {
    static int factorial(int n)
    {
        if(n == 0 || n == 1) return  1;
        else
        {
            int product = 1;
            for(int i=1;i<=n;i++)
            {
                product *= i;
            }
            return product;
        }
    }
    static int factorial_iterative(int b)
    {
        if(b == 0 || b == 1) return 1;
        else
        {
            return  b * factorial_iterative(b-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        int b = factorial(a);
        int c = factorial_iterative(a);
        System.out.println(b);
        System.out.println(c);
    }
}
