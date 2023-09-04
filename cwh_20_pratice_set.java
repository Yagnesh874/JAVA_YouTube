import java.util.*;

public class cwh_20_pratice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Practice problem 1
        float[] marks = new float[5];
        float sum=0;
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Enter elements");
            marks[i] = sc.nextFloat();
        }
        for(int i=0;i<marks.length;i++)
        {
            sum+=marks[i];
        }
        System.out.println("The total sum is : "+sum);

//        Practice problem 2
        int[] arr = new int[5];
        boolean s = false;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter elements");
            arr[i]  = sc.nextInt();
        }
        System.out.println("Enter any number  : ");
        int num = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == num)
            {
                s  = true;
                break;
            }
        }
        if(s == true)
        {
            System.out.println("The number is found");
        }
        else
        {
            System.out.println("The number is not found");
        }


        //Practice problem 3
        int[] brr = new int[5];
        int sum1=0;
        for(int i=0;i<brr.length;i++)
        {
            System.out.println("Enter elements : ");
            brr[i] = sc.nextInt();
        }
        for(int i=0;i<brr.length;i++)
        {
            sum1+=brr[i];
        }
        System.out.println("The avarage marks is  : "+sum1/ brr.length);

        //Practice problem 4
       int [] crr = new int[5];
        for(int i=0;i<crr.length;i++)
        {
            System.out.println("Enter elements : ");
            crr[i] = sc.nextInt();
        }
        for(int i=0;i<crr.length;i++)
        {
            for(int j=0;j<crr.length;j++)
            {
                if(crr[i] > crr[j])
                {
                    int temp = crr[i];
                    crr[i] = crr[j];
                    crr[j] = temp;
                }
            }
        }
        for(int i=0;i<crr.length;i++)
        {
            System.out.println(crr[i]);
        }

       //Practice problem 5

        int [] drr = new int[5];
        for(int i=0;i<drr.length;i++)
        {
            drr[i] = sc.nextInt();
        }
        int max = 0;
        for(int e:drr)
        {
            if(e > max)
            {
                max = e;
            }
        }
                System.out.println("The maximum number is : "+max);
        //Practice problem 6
        int [] err = new int[5];
        boolean isSorted = false;
        for(int i=0;i<err.length;i++)
        {
            err[i] = sc.nextInt();
        }
        for(int i=0;i<err.length -1;i++)
        {
            if(err[i] > err[i+1])
            {
                isSorted = true;
                break;
            }
        }
        if(isSorted == false)
        {
            System.out.println("The array is already sorted");
        }
        else
        {
            System.out.println("The array is not sorted");
        }
    }

}
