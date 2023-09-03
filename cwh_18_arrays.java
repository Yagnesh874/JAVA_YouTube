import java.util.*;
public class cwh_18_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {67,43,67,89,76,54};
        System.out.println(marks.length);

        System.out.println("Printing the array using for loop");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("Printing the array in reverse order using for loop");
        for(int i=marks.length -1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }

        System.out.println("Printing the array using for-each loop");
        for(int element:marks)
        {
            System.out.println(element);
        }

        System.out.println("Taking input from the user");
        int [] arr = new int[6];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter elements ["+i+"]");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
