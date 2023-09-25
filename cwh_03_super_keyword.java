
class superClass
{
  private  int num;

  superClass(int value)
  {
      this.num  = value;
      System.out.println("Super class constructor called");
  }

  public int display()
  {
      System.out.println("The superclass value is : "+num);
      return  num;
  }
}
class subClass extends superClass
{
    private  int subClassValue;
    subClass(int superValue,int subValue)
    {
        super(superValue);
        this.subClassValue = subValue;
    }
    @Override
    public  int display()
    {
        System.out.println("Subclass value : "+subClassValue);
        return subClassValue;
    }
}
public class cwh_03_super_keyword {
    public static void main(String[] args) {
        subClass obj = new subClass(10,20);
        int num  = obj.display();
        System.out.println(num);
    }
}
