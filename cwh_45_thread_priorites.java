
class MyThr1 extends Thread
{
    public MyThr1(String name)
    {

        super(name);
    }
    public  void run()
    {
        while(true)
        {
        System.out.println("I am thread : "+this.getName());

        }
    }
}
public class cwh_45_thread_priorites {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4 (Most Important)");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
