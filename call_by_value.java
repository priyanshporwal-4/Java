class Ram
{
    int b,c,d;
    public void max(int a)
    {
        b=a;
        System.out.println(b);

    }
    public void max(int e,int f)
    {
        c=e;
        d=f;
        if(c>d)
        {
            System.out.println("first no is maximum");
        }
        else
        {
            System.out.println("second no is maximum");
        }
    }
}
class prac14
{
    public static void main(String args[])
    {
        Ram obj1=new Ram();
        obj1.max(5);
        obj1.max(8,9);
    }
}