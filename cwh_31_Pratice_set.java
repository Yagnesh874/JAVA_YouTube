import java.util.Scanner;
import java.util.concurrent.RecursiveAction;

class cylinder
{
    private int radius;
    private int height;
    public cylinder(int radius,int height)
    {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius()
    {
        return radius;
    }
    public void setRadius(int radius)
    {
        this.radius  = radius;
    }
    public int getHeight()
    {
        return  height;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }
    public double surfaceArea()
    {
        return 2 * 3.14 * radius * radius + 2 * 3.14 *radius*height;
    }
    public double volume()
    {
        return 3.14 * radius * radius * height;
    }
}
 class rec
{
    private int length;
    private int breadth;
    public rec()
    {
        this.length = 4;
        this.breadth = 5;
    }
    public rec(int length,int breadth)
    {
        this.length = length;
        this.breadth  = breadth;
    }
    public int getLength()
    {
        return length;
    }
    public int getBreadth()
    {
        return  breadth;
    }
}
public class cwh_31_Pratice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter radius : ");
        int radius  = sc.nextInt();
        System.out.println("Enter height : ");
        int height = sc.nextInt();

        //Problem no 1
        cylinder s1 = new cylinder(radius,height);
        s1.setRadius(radius);
        System.out.println("The radius is : "+s1.getRadius());
        s1.setHeight(height);
        System.out.println("The height is : "+s1.getHeight());

        //Problem no 2
        System.out.println("The surface area is : "+s1.surfaceArea());
        System.out.println("The volume is : "+s1.volume());

         */
        rec r1 = new rec();
        System.out.println("The length is : "+r1.getLength());
        System.out.println("The breadth is : "+r1.getBreadth());

        rec r2 = new rec(7,10);
        System.out.println("The length is  : "+r2.getLength());
        System.out.println("The breadth is : "+r2.getBreadth());
    }
}
