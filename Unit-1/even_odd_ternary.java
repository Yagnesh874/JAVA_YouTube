import java.util.*;
public class even_odd_ternary {
    public static  void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n=obj.nextInt();
        String result=(n%2==0)?"even":"odd";
        System.out.println(result);
    }
}