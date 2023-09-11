public  class cwh_21_Methods
{
     int logic(int x,int y)
    {
        int z = 0;
        if(x>y)
        {
            z = x+y;
        }
        else
        {
            z = (x+y) * 4;
        }
        return  z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        cwh_21_Methods obj = new cwh_21_Methods();
        int c = obj.logic(a,b);
        System.out.println(c);
//        int c = logic(a,b);
//        System.out.println(c);
    }
}