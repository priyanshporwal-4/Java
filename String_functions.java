class Ram
{
    String a="My name is - ";
    String b="PRIYANSH KALA";
    public void displaystring()
    {
        System.out.println("two strings are");
        System.out.println(a);
        System.out.println(b);
    }

    public void length()
    {
        System.out.println("length of first string is : "+ a.length());
        System.out.println("length of second string is : "+ b.length());
    }
    public void join()
    {
        System.out.println("after joining two strings : "+ a.concat(b));
    }
    public void compare()
    {
        System.out.println("comparison of string : "+ a.compareTo(b));
    }
}
class prac16
{
    public static void main(String args[])
    {
        Ram obj=new Ram();
        obj.length();
        obj.join();
        obj.compare();
    }
}