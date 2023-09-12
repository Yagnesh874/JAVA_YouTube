class MyMainEmployee
{
    int id;
    int salary;
    String name;
    public MyMainEmployee()
    {
        id = 45;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String Myname,int Myid)
    {
        id = Myid;
        name =Myname;
    }
    public MyMainEmployee(String Myname,int Myid,int Mysalary)
    {
        name  = Myname;
        id = Myid;
        salary = Mysalary;
    }
    public String Getname()
    {
         return name;
    }

   public void SetName(String n)
   {
       name = n;
   }
   public void setId(int i)
   {
       id = i;
   }
   public int getId()
   {
       return id;
   }
   public void setSalary(int salary1)
   {
       salary = salary1;
   }
    public int getSalary()
    {
        return  salary;
    }

}
public class cwh_30_constructor {
    public static void main(String[] args) {
        MyMainEmployee obj = new MyMainEmployee("CodeWithHarry",42);
        MyMainEmployee obj1 = new MyMainEmployee();
        MyMainEmployee obj2 = new MyMainEmployee("Yagnesh",34,23);
        System.out.println(obj2.getId());
        System.out.println(obj2.Getname());
        System.out.println(obj2.getSalary());

    }
}
