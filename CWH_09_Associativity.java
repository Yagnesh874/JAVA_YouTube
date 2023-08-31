public class CWH_09_Associativity {
    public static  void main(String[] args)
    {
        /*
         precedence  & associativity
        int a = 6*5-34/2;

        Highest precedence goes to * and /.They are then evaluated on the basics to
        left to right associativity
            30-34/2
            30-17
            13

        System.out.println(a);

        int b = 60/5 - 34*2;

            12 - 68
            -56

        System.out.println(b);

         */
        int x = 6;
        int y = 1;
        int k = x * y/2;
        System.out.println(k);

        int b = 5;
        int c = 2;
        int a = 10;
        int k1 = (b*b) - (4*a*c)/(2*a);
        System.out.println(k1);
    }
}
