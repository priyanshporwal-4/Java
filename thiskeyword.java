class thisk
{int a;double b;
    thisk(int a)
    {
    this.a=a;
    }
            thisk(double b)
    {
    b=b;
    }
    void t2()
    {
        System.out.println("value with this keyword is = "+a);
    }
       void t3()
    {
        System.out.println("value without this keyword is = "+b);
    }

 
}
class thiskeyword
{
    public static void main(String args[])
    {
        thisk obj=new thisk(5);
        obj.t2();
        obj.t3();
    }
}