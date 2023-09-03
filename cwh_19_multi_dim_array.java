import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class cwh_19_multi_dim_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] flats = new int[3][3];
        flats[0][0] = 78;
        flats[0][1] = 89;
        flats[0][2] = 21;
        flats[1][0] = 90;
        flats[1][1] = 91;
        flats[1][2] = 78;
        flats[2][0] = 67;
        flats[2][1] = 35;
        flats[2][2] = 95;
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats.length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        
        System.out.println("Taking input from the user");
        int [][] flats1 = new int[3][3];
        for(int i=0;i<flats1.length;i++)
        {
            for(int j=0;j< flats1.length;j++)
            {
                System.out.println("Enter elements ["+i+"]"+"["+j+"]"+" : ");
                flats1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i< flats1.length;i++)
        {
            for(int j=0;j< flats1.length;j++)
            {
                System.out.print(flats1[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
