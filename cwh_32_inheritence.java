
class base
{
    int x;
    public void printMe()
    {
        System.out.println("I am constructor");
    }
    public int getX()
    {
        System.out.println("I am in base and setting X now");
        return  x;
    }
    public  void setX(int x)
    {
        this.x = x;
    }
}
class derived extends base
{
    int y;

    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y = y;
    }
}
public class cwh_32_inheritence {
    public static void main(String[] args) {
        //Creating an object of base class
        base b1 = new base();
        b1.setX(4);
        System.out.println(b1.getX());

        //Creating an object of derived class
        derived b2 = new derived();
        b2.setY(10);
        System.out.println(b2.getY());
    }
}
