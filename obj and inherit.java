class foo
{
    String dostuff(int x){
        return "hello";
    }
}
class faa extends foo
{
    int dostuff(String s)
    {
        return 42;
    }
}
class ass1_2
{
    public static void main(String args[])
    {
        faa obj=new faa();
    }
}