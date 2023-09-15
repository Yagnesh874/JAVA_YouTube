
class base1
{
    base1()
    {
        System.out.println("I am constructor");
    }
    base1(int x)
    {
        System.out.println("I am Overloaded constructor X is : "+x);
    }
    public int x;

    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
}
class derived1 extends base1
{

    derived1()
    {
//        super(1);
        System.out.println("I am derived1 constructor");
    }
    derived1(int x,int y)
    {
        super(x);
        System.out.println("I am overloaded derived1 constructor with Y is : "+y);
    }
    int y;
    public int getY()
    {
        return  y;
    }
    public void setY(int y)
    {
        this.y = y;
    }
}
class ChildOfderived extends derived1
{
    ChildOfderived()
    {
        System.out.println("I am ChildOfDerived constructor");
    }
    ChildOfderived(int x,int y,int z)
    {
        super(x,y);
        System.out.println("I am overloaded ChildOfDerived constructor with z is : "+z);
    }
}
public class cwh_33_constructor_in_inheritence {
    public static void main(String[] args) {
//        base1 b = new base1();
//        derived1 b1 = new derived1();
//        derived1 b2 = new derived1(5,6);
            ChildOfderived b3 = new ChildOfderived(4,7,2);
    }

}
