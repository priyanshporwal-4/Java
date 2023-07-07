import java.util.*;
class priyansh
{
    String name;
    String enroll;
        
        public String t2()
        {
            String mix=name+"  "+enroll;
            return mix;
        }
}
class multipleclass
{
    public static void main(String args[])
    {
        priyansh obj=new priyansh();
        Scanner kb=new Scanner(System.in);
        System.out.println("enter name");
        obj.name=kb.nextLine();
        System.out.println("enter enrollment");
        obj.enroll=kb.nextLine();
        String result=obj.t2();
        System.out.println(result);
    }
}
