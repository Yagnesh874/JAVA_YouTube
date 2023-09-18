import java.util.Scanner;
import java.lang.Exception;

class MyExp extends Exception
{
    @Override
    public String toString()
    {
        return   "I am toString()";
    }
    @Override
    public String getMessage()
    {
        return   "i am getMessage()";
    }
}
public class cwh_52_exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int a = sc.nextInt();

        if(a < 9)
        {
            try {
                throw new MyExp();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
//                System.out.println(e);
                e.printStackTrace();
            }
            System.out.println("finished");
        }
    }
}
