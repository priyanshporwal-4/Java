import java.util.*;
class ampersand
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("enter the value for x");
        int x=kb.nextInt();
        System.out.println("enter the value for y");
        int y=kb.nextInt();
        if(++x<10 && ++y>15)
        {
            x++;
        }
        y++;
        System.out.println(x+" "+y);
    }
}