import java.util.*;
class threedimensionalarray
{
public static void main(String args[])
{
int i;int j;int k;
Scanner kb=new Scanner(System.in);
System.out.println("enter i");
i=kb.nextInt();
System.out.println("enter j");
j=kb.nextInt();
System.out.println("enter k");
k=kb.nextInt();
String array[][][]={{{"priyansh","piyush","navneet","sagar","pritam"},{"5","6","7","8","9"}},{{"a","b","c","d","e"},{"1","2","3","4","5"}}};
System.out.println("your required result is "+array[i][j][k]);
}}
