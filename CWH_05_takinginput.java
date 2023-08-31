import java.util.*;

public class CWH_05_takinginput {
    public static void main(String[] args)
    {
          System.out.println("Taking input from the user : ");
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number 1 : ");
          int a = sc.nextInt();
          System.out.println("Enter a number 2 : ");
          int b = sc.nextInt();
          int sum = 0;
          sum = a+b;
          System.out.println(sum);
          boolean b1 = sc.hasNextInt();
          System.out.println(b1);
          String name = sc.nextLine();
          System.out.println(name);
    }
}
