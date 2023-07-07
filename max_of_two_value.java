import java.util.*;
class prac4
{
    public static void main(String args[])
    {
        int n1,n2;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter the first value");
        n1=kb.nextInt();
        System.out.println("enter the second value");
        n2=kb.nextInt();
        String max=(n1>n2) ? "first value is maximum":"second value is maximum";
        System.out.println(max);
    }
}