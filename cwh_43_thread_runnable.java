
class MythreadRunnable1 implements Runnable
{
    public  void run()
    {
        while(true)
        {
        System.out.println("I am thread 1 not a threat 1");

        }
    }
}
class MyThreadRunnable2 implements Runnable
{
    @Override
    public  void run()
    {
        while(true)
        {

        System.out.println("I am thread 2 not a threat 2");
        }
    }
}
public class cwh_43_thread_runnable {
    public static void main(String[] args) {
        MythreadRunnable1 bullet1 = new MythreadRunnable1();
        Thread gun1 = new Thread(bullet1);


        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
