
interface Bicycle
{
    int a=45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle
{
    void blowHornk3g();
    void blogHornmhn();
}
class AvonCycle implements Bicycle,HornBicycle
{
    int speed = 7;
    void blowhorn()
    {
        System.out.println("Pee pee poo poo");
    }
    @Override
    public void applyBreak(int decrement)
    {
        System.out.println("Applying break");
    }
    @Override
    public void speedUp(int increment)
    {
        System.out.println("Applying speed");
    }
    @Override
    public void blowHornk3g()
    {
        System.out.println("Kabhi khushi kabhu gum pee poo");
    }
    @Override
    public void blogHornmhn()
    {
        System.out.println("Main hoon naa poo poo");
    }

}
public class cwh_40_interfaces {
    public static void main(String[] args) {
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBreak(1);
        cycle1.blowHornk3g();
        cycle1.blogHornmhn();
        System.out.println(cycle1.a);
    }
}
