import java.util.*;
public class CWH_06_Percentage {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        float per = 0;
        System.out.println("Enter a subject 1 : ");
        int sub1 = sc.nextInt();
        System.out.println("Enter a subject 2 : ");
        int sub2 = sc.nextInt();
        System.out.println("Enter a subject 3 : ");
        int sub3 = sc.nextInt();
        System.out.println("Enter a subject 4 : ");
        int sub4 = sc.nextInt();
        System.out.println("Enter a subject 5 : ");
        int sub5 = sc.nextInt();
        sum = sub1+sub2+sub3+sub4+sub5;
        per = sum/5;
        System.out.println("The total marks of subject is : "+sum);
        System.out.println("The total percentage is : "+per);
    }
}
