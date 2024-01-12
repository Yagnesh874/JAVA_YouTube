import java.util.Scanner;
  class ScannerCircle {
      public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a radius : ");
          double radius=sc.nextDouble();
          double circle=3.14*radius*radius;
          System.out.println("The circle of the area is "+circle);
      }
}
