import java.util.*;
public class SumDivisibleBy7 {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int i;
        for(i=100;i<=200;i++){
            if(i%7==0){
                sum=sum+i;
            }
        }
        System.out.println("The sum is : "+sum);
    }
}