class Myemployee
{
    private int id;
    private  String name;
    public String getname()
    {
        return name;
    }
    public void setname(String n)
    {
        name = n;
    }
    public void setid(int i)
    {
        id = i;
    }
    public int getId()
    {
        return id;

    }
}
public class cwh_28_Access_modifier {
    public static void main(String[] args) {
        Myemployee obj = new Myemployee();
//        obj.id = 2;
//        obj.name = "CodeWithHarry";
        obj.setname("CodeWithHarry");
        System.out.println(obj.getname());
    }
}
