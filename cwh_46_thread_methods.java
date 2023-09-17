
class MyNewThr1 extends Thread
{
    public  void run()
    {
        while(true)
        {

        System.out.println("Thank you MyNewThr1");
        }
    }
}
class MyNewThr2 extends Thread
{
    @Override
    public  void run()
    {
        while(true)
        {
        System.out.println("Thank you MyNewThr2");

        }

    }
}
public class cwh_46_thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try
        {
        t1.join();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        t2.start();
    }
}
