import java.util.*;

class game
{
    public int number;
    public int inputNumber;
    public int noOfGuesses;
    public  int getNoGuesses()
    {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses)
    {
            this.noOfGuesses = noOfGuesses;
    }
     game()
    {
        Random rand = new Random();
        this.number = rand.nextInt(100);
        System.out.println(number);
    }
    void takeUserInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        inputNumber  = sc.nextInt();
    }
    boolean isCorrectNumber()
    {
        if(inputNumber == number)
        {
            return true;
        }
        else if(inputNumber < number)
        {
            System.out.println("To less...");
        }
        else if(inputNumber > number)
        {
            System.out.println("To high...");
        }
            return  false;
    }
}
public class cwh_37_ex3sol {
    public static void main(String[] args) {
        game g = new game();
        boolean  b = false;
        while(!b) {
            g.takeUserInput();
            g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
