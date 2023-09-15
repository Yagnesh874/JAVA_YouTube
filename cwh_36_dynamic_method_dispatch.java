//Super class
class Phone
{
    public void greet()
    {
        System.out.println("Hello good morning");
    }
    public void on()
    {
        System.out.println("Turning on Phone");
    }
}
//Sub class
class smartPhone extends Phone
{
    public void swagat()
    {
        System.out.println("Apka sawgat hai");
    }
        @Override
        public void on()
        {
            System.out.println("Turning on smartPhone");
        }
}
public class cwh_36_dynamic_method_dispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone();
        //obj.name();

        Phone obj = new smartPhone();
        obj.greet();
        obj.on();
    }
}
