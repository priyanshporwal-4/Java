class Ram
{
    public int shyam(int a,int b)
    {
        int c=a+b;
        return c;
    }
}
class prac13
{
    public static void main(String args[])
    {
        Ram obj1=new Ram();
        int d=obj1.shyam(5,6);
        System.out.println(d);

    }
}