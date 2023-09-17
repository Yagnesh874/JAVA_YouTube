
class c1
{
    public  int x  = 10;
    protected int y = 20;
    int z  = 30;
    private int a  =23;

    public  void meth1()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class cwh_41_access_modifires {
    public static void main(String[] args) {
        c1 s1 = new c1();
        s1.meth1();
    }
}
