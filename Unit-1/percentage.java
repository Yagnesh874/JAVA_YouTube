import java.util.*;
class percentage{
    public  static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a name of student : ");
        String firstname=sc.next();
        System.out.println("Enter a surname of student : ");
        String lastname=sc.next();
        System.out.println("Enter a roll number of a student : ");
        int rollNo=sc.nextInt();
        int num_Subject=5;
        int total_Marks=0;
        for(int i=1;i<=num_Subject;i++){
            System.out.println("Enter a subject marks of : "+i);
            int marks=sc.nextInt();
            total_Marks+=marks;
        }
        double percentage= (double)total_Marks/(num_Subject*100)*100;
        System.out.println("The name of student : "+firstname);
        System.out.println("The surname of student : "+lastname);
        System.out.println("The roll number of student is : "+rollNo);
        System.out.println("The marks of student : "+total_Marks);
        System.out.println("The percentage of student : "+percentage);

    }
}