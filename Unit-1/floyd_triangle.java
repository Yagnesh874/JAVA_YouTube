import java.util.*;
public class floyd_triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number;
        int rows;
        int cols;
        int count=0;
        System.out.println("Enter a number : ");
        number=sc.nextInt();
        for(rows=1;rows<=number;rows++){
            for(cols=1;cols<=rows;cols++){
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}