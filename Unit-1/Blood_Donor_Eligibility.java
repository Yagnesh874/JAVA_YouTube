import java.util.*;
public class Blood_Donor_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        int weight;
        System.out.println("Enter a age of a person : ");
        age=sc.nextInt();
        System.out.println("Enter weight of a person : ");
        weight=sc.nextInt();
        if(age>=18 && age<=55 && weight>=45){
            System.out.println("The person eligible for a blood donate");
        }
        else {
            System.out.println("The person is not eligible for a blood donate");
        }
    }
}