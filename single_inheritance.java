class parent//parent or base class
{
void sample_method()
{
    int a=1;
    System.out.println(a);
}
}
class child extends parent//child class
{
    void sample_method1()
    {
        int b=2;
        System.out.println(b);

    }
}
class single_inheritance
{
public static void main(String args[])
{
    child obj=new child();
    obj.sample_method();
    obj.sample_method1();
}
}