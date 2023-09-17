
class MyThr extends Thread
{
    public MyThr(String name)
    {
        super(name);
    }
    public  void run()
    {
//        int i = 34;
        System.out.println("Thank you");
        System.out.println("I am thread");
    }
}
public class cwh_44_thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("harry");
        MyThr t2 = new MyThr("RRR");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is : "+t1.getId());
        System.out.println("The name of Thread is  : "+t1.getName());
        System.out.println("The id of thread t2 is : "+t2.getId());
        System.out.println("The id of thread t2 is  :"+t2.getName());
    }
}
