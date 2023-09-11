public class cwh_22_Method_overloading {

    static  void foo()
    {
        System.out.println("Good morning");
    }
    static  void foo(int a)
    {
        System.out.println("Good morning" + a + "bro");
    }
    static void change(int x)
    {
        x = 45;
    }
    static  void tellMeJoke()
    {
        System.out.println("What do you call a fish without eyes? Fsh.");
    }

    public static void main(String[] args) {
//        tellMeJoke();
//        int[] marks = {57,89,54,90,43};
//        int a  = 33;
//        change(a);
//        System.out.println("The value of A after running changes : "+a);
        foo();
        foo(400);

    }
}
