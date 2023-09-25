import java.util.Scanner;

class person
{
    private String firstName;
   private String lastName;
    public String getFirstname()
    {
        return firstName;
    }
    public String getLastName()
    {
        return  lastName;
    }
}

class employee extends  person
{
    private int id;
    private String firstname;

    private  String lastname;
    private String jobTitle;
    public int getEmployeeId()
    {
        return  id;
    }
    employee(int id,String firstname,String lastname,String jobTitle )
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.jobTitle = jobTitle;
    }
    @Override
    public String  getFirstname()
    {
        return  firstname;
    }
    public String getLastName()
    {
        return lastname;
    }
    public String employeeJobTitle()
    {
        return  jobTitle;
    }

}
public class cwh_02_employee_detail {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter employee id : ");
        int id = sc.nextInt();
        System.out.println("Enter employee name");
        String firstname = sc.next();
        System.out.println("Enter last name : ");
        String lastname = sc.next();
        System.out.println("Enter employee job title");
        String jobTitle = sc.next();

        employee obj = new employee(id,firstname,lastname,jobTitle);
        int num = obj.getEmployeeId();
        String str1 = obj.getFirstname();
        String  str2 = obj.getLastName();
        String  str3 = obj.employeeJobTitle();
        System.out.println("The employee id is  : "+num);
        System.out.println("The employee first name is :  "+str1);
        System.out.println("The employee last name is : "+str2);
        System.out.println("The employee job title is : "+str3);

    }
}
