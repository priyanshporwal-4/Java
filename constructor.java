class two_construct
{
double a,l,b;
two_construct(double x)
{
    a=x;
}
two_construct(double p,double q)
{
l=p;
b=q;
}
void calc1()
{
    System.out.println(a);
}
void calc2()
{
    System.out.println("area="+(l*b));
}
}
class constructor
{
    public static void main(String args[])
    {
        two_construct obj1=new two_construct(1);
        two_construct obj2=new two_construct(3,3);
        obj1.calc1();
        obj2.calc2();
    }
}