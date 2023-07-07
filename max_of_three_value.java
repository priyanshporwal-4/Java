import java.util.*;
class prac5
{
    public static void main(String args[])
    {
        int n1,n2,n3;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter the first value");
        n1=kb.nextInt();
        System.out.println("enter the second value");
        n2=kb.nextInt();
        System.out.println("enter the third value");
        n3=kb.nextInt();
        if(n1>n2)
        {
            if(n1>n3)
            {
            System.out.print("Maximum value is: "+ n1);
            }
        }
        if(n2>n1)
        {
            if(n2>n3)
            {
            System.out.print("Maximum value is: "+ n2);
            }
        }
        if(n3>n1)
        {
            if(n3>n2)
            {
            System.out.print("Maximum value is: "+ n3);
            }
        }
    }
}