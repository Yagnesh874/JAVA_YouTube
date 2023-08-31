import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class CWH_CH_1_PS
{
    public static void main(String[] args)
    {
        //Question 1
       Scanner sc = new Scanner(System.in);

        float sum = 0;
        float per = 0;
        float found = 0;
        System.out.println("Enter a subject 1 : ");
        float sub1 = sc.nextInt();
        System.out.println("Enter a subject 2 : ");
        float sub2 = sc.nextInt();
        System.out.println("Enter a subject 3 : ");
        float sub3 = sc.nextInt();
        sum = (sub1+sub2+sub3)/30;
        per = (sum/300)*100;
        found = (per/10);
        System.out.println("The total number of subject is : "+sum);
        System.out.println("The total percentage is : "+per);
        System.out.println("The total CGPA is : "+found);



/*
        question 2
        System.out.println("What is your name ");
        String name = sc.nextLine();
        System.out.println("Hello "+ name + " Have a good day" );

 */
        /*
        question 3
        float km;
        float miles = 0;
        float a = 0.621371f;
        System.out.println("Enter a kilometer : ");
        km = sc.nextFloat();
        miles = km * a;
        System.out.println("The kilometer to miles is : "+miles);

         */

        /*
        question 5
          int no;
        System.out.println("Enter a number  : ");
        System.out.println(sc.hasNextInt());

         */

    }
}
