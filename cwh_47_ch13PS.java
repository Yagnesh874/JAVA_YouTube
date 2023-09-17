
class GoodMorning extends Thread
{
    public void run()
    {
        while(true)
        {

        System.out.println("Good morning");
        }
    }
}
class Welcome extends Thread
{
    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                Thread.sleep(200);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        System.out.println("welcome");
        }
    }
}
public class cwh_47_ch13PS {
    public static void main(String[] args) {
        GoodMorning t1 = new GoodMorning();
        Welcome t2 = new Welcome();
//        t1.setPriority(6);
//        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        //t1.start();
        //t2.start();
    }
}
