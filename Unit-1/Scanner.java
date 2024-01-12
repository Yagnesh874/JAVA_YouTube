import java.util.Scanner;
 class ScannerDemo {
    public static  void main(String[] args){
        int a,b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1 : ");
        a=sc.nextInt();
        System.out.println("Enter a number 2 : ");
        b=sc.nextInt();
        System.out.println("Enter a number 3 : ");
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("greater number is "+a);
        } else if (b>a && b>c) {
            System.out.println("greater number is "+b);

        }
        else {
            System.out.println("greater number is "+c);
        }
    }
}