import java.util.*;
import java.util.stream.StreamSupport;

public class Prime_Number {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        boolean flag=false;
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        for(int i=2;i<=num;i++){
            if(num%2==0){
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not prime number");
        }
    }
}