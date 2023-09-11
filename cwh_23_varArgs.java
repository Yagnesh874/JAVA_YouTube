public  class cwh_23_varArgs
{
    static  int cal(int ...arr)
    {
        int result = 0;
        for(int a:arr)
        {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(cal(4,5));
        System.out.println(cal(4,6,3));
        System.out.println(cal(2,6,8,1));
    }
}