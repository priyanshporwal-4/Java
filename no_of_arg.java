class prac3
{
    public static void main(String args[])
    {
        int count=args.length;
        System.out.println("total number of arguments are: "+count);
        for(int i=0;i<args.length;i++)
        System.out.println("your " +(i+1)+" argument is: "+ args[i]);
        
    }
}