/*
* this program uses commandline
* arguments as input
*/
class ComLineTest
{
    public static void main(String args[])
    {
        int count,i=0;
        String sample;
        count=args.length;
        System.out.println("number of arguments = "+count);
        while(i<count)
        {
            sample=args[i];
            i=i+1;
            System.out.println(i+":"+"java is "+sample+"!");
        }
        }
    }
//page 43