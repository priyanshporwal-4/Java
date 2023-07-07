import java.util.*;
class prac8
{
    public static void main(String args[])
    {
        int n,sum=0,a,b,c;
        Scanner kb=new Scanner(System.in);
        System.out.println("enter the three digit number");
        n=kb.nextInt();
        a=(n%100)%10;
        b=n/100;
        c=(n/10)%10;
        int cubeadd=(int)((Math.pow(a,3))+(Math.pow(b,3))+(Math.pow(c,3)));//function used for making cube of values
        if(cubeadd==n)
        {
            System.out.println("the given number is ARMSTRONG");
        }
        else{
            System.out.println("the number is NOT ARMSTRONG");
        }
    }
}