
abstract class parent2
{
    public parent2()
    {
        System.out.println("I am base2 constructor");
    }
    public  void sayHello()
    {
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class child2 extends parent2
{
    @Override
    public void greet()
    {
        System.out.println("Good morning");
    }
    @Override
     public void greet2()
    {
        System.out.println("Good afternoon");
    }
}

abstract class child3 extends parent2
{
    public  void the()
    {
        System.out.println("I am good");
    }
}
public class cwh_39_abstract {
    public static void main(String[] args) {
        //parent2 c1 = new parent2(); -- error
        child2 c = new child2();
        //child3 c2 = new child3(); -- error
        }
    }
