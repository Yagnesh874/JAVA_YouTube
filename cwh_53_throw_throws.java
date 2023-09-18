
class negativeRadiusException extends Exception
{
    @Override
    public String toString()
    {
        return "Radius cannot be  negative";
    }
    @Override
    public String getMessage()
    {
        return "Radius cannot be negative";
    }
}
public class cwh_53_throw_throws {
    public static  double area(int r) throws  negativeRadiusException
    {
        if(r<0)
        {
            throw new negativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException
    {
        int result = a/b;
        return  result;
    }
    public static void main(String[] args) {
        try {
            //int c = divide(6,0);
            //System.out.println(c);
            double ans  = area(75);
            System.out.println(ans);
        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }
    }
}
