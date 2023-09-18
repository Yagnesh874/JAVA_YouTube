import java.util.Scanner;

public class cwh_51_nested_try {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] marks1 = new int[5];
        marks1[0]  = 5;
        marks1[1]  = 34;
        marks1[2]  = 30;
        marks1[3] = 21;
        System.out.println("Enter the array index:  ");
        int ind = sc.nextInt();
        boolean flag = true;
        while(flag) {
            try {
                System.out.println("welcome to 51");

                try {
                    System.out.println(marks1[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
                System.out.println(e);
            }
        }
    }
}
