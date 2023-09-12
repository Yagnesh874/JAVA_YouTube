class employee
{
    int id;
    int salary;
    String name;
    public void printDeatils()
    {
        System.out.println("The id is : "+id);
//        System.out.println("The salary is : "+salary);
        System.out.println("The name is : "+name);
    }
    public int get()
    {
        return salary;
    }
}
public class cwh_26_Custom_class {
    public static void main(String[] args) {
        System.out.println("Our first custom class");
        employee obj = new employee();//Instantiating a new employee object
        employee obj1 = new employee();


        //Creating an Attributes in obj
        obj.id = 12;
        obj.salary = 12;
        obj.name = "Ramesh";

        //Creating an Attributes in obj1
        obj1.id = 20;
        obj1.salary = 14;
        obj1.name = "Hardik";


        //Printing the details
        obj.printDeatils();
        obj1.printDeatils();
        int salary = obj1.get();
        System.out.println(salary);
        //System.out.println(obj.id);
        //System.out.println(obj.name);
    }
}
