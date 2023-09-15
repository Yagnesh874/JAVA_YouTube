import javax.print.Doc;

class EkClass
{
    EkClass(int a)
    {
        this.a = a;
    }
    public int getA()
    {
        return a;
    }
    int a;
    public int returnNone()
    {
        return a;
    }
}
class DoClass extends EkClass
{
    DoClass(int c)
    {
        super(c);
        System.out.println("I am DoClass constructor");
    }
}
public class cwh_34_This_Super {
    public static void main(String[] args) {
    EkClass s1 = new EkClass(4);
    DoClass s2 = new DoClass(6);
    System.out.println(s1.getA());

    }
}
