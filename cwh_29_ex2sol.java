import java.util.*;
public class cwh_29_ex2sol {
    public static void main(String[] args)
    {
        //0 rock
        //1 paper
        //2 scissor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for rock,Enter 1 for paper,Enter 2 for scissor : ");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userinput == computerInput)
        {
            System.out.println("Draw");
        }
        else if(userinput == 0 && computerInput == 2 || userinput == 1 && computerInput == 0
        || userinput == 2 && computerInput == 1)
        {
            System.out.println("You win");
        }
        else
        {
            System.out.println("Computer win");
        }
        System.out.println("Computer choice : "+computerInput);
    }
}
