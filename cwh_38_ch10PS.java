import java.util.Scanner;

class circle
{
    circle(int r)
    {
        System.out.println("I am circle constructor");
        this.radius = r;
    }
    public  int radius;

    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends circle
{
    cylinder1(int r,int h)
    {
        super(r);
        System.out.println("I am cylinder1 perameterized constructor");
        this.height = h;
    }
    public int height;
    public double volume()
    {
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class cwh_38_ch10PS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter radius : ");
        //int radius  = sc.nextInt();
//        circle c = new circle(12);
            cylinder1 c1 = new cylinder1(4,12);
    }
}
