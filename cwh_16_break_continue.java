public class cwh_16_break_continue {
    public static void main(String[] args) {


        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            System.out.println("Java is best programming language");
            if(i==2)
            {
                System.out.println("Ending the loop");
                break;
            }
        }
//-------------------------------------------------------------------------------------------------->
        int d=0;
        while(d<5)
        {
            System.out.println(d);
            System.out.println("Java is best programming language");
            if(d==2)
            {
                System.out.println("Ending the loop");
                break;
            }
            d++;
        }
//----------------------------------------------------------------------------------------------------------->
        int j=0;
        do {
            System.out.println(j);
            System.out.println("Java is the best programming language");
            if(j==2)
            {
                System.out.println("Loops end here");
                break;
            }
            j++;
        }while(j<5);
        System.out.println("Ending the loop ");
//-----------------------------------------Continue Statement------------------------------------------------------------------>
        for(int k=0;k<6;k++)
        {
            if(k==2)
            {
                continue;
            }
            System.out.println(k);
        }
//------------------------------------------------------------------------------------------------------------>
        int a=0;
        while(a<6)
        {
            a++;
            if(a==3)
            {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(a);
            System.out.println("Java is best");
        }
//----------------------------------------------------------------------------------------------------------->
        int c=0;
        do {
            c++;
            if(c==3)
            {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(c);
            System.out.println("Java is great");
        }while (c<6);
    }

}
//-----------------------------------------------Ends here---------------------------------------------------------->