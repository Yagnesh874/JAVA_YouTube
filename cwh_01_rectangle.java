import java.util.Scanner;

class shape
{
    public  double getarea()
    {
        return 0;
    }
}

class Rectangle extends  shape
{
    private  double width;
    private  double length;

    Rectangle(double width,double length)
    {
        this.width = width;
        this.length = length;
    }
    @Override
    public double getarea()
    {
        return  width * length;
    }
}
public class cwh_01_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width : ");
        double width = sc.nextDouble();
        System.out.println("Enter length : ");
        double length  = sc.nextDouble();

        Rectangle obj = new Rectangle(width,length);
        double area = obj.getarea();
        System.out.println(area);
    }
}
