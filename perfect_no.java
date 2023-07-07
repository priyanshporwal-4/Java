import java.util.*;
class prac9
{
    public static void main(String args[])
    {
        int n,sum=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter number");
        n=kb.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println("the given number is perfect");
        }
        else{
            System.out.println("the number is not perfect");
        }
    }
}