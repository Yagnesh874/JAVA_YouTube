import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class cwh_54_finally
{

    public static int greet()
    {
        try
        {
            int a = 50;
            int b = 2;
            int c = a / b;
            return c;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {

            System.out.println("The end of this programme function");
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a  = 5;
        int b = 9;
        while(true)
        {
            try {
                System.out.println(a/b);
            }
            catch (Exception e)
            {
                System.out.println(e);
                break;
            }
            finally
            {
                System.out.println("I am finally the value of b = "+b);
            }
            b--;
        }
        try {
            System.out.println(50/10);
        }
        finally
        {
            System.out.println("I am finally");
        }
    }
}
