import java.util.*;
public class prac12 
{  
public static void main(String[] args)   
{  
 int n,flag = 0,i = 0;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter no. of elements you want :");
        n = kb.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(i = 0; i < n; i++)
        {
            arr[i] = kb.nextInt();
        }
        System.out.println("enter the value 1 or 2 to sort in ascending or descending");
        System.out.println("1.ascending");
        System.out.println("2.descending");
        int suggest=kb.nextInt();
        System.out.println("Array elements after sorting:");  
        if(suggest==1)
        {
for (i = 0; i < n; i++)   
{  
for (int j = i + 1; j < n; j++)   
{  
int tmp = 0;  
if (arr[i] > arr[j])   
{  
tmp = arr[i];  
arr[i] = arr[j];  
arr[j] = tmp;  
}  
}  
System.out.println(arr[i]);  
} 
}
else if(suggest==2) 
{
  for (i = 0; i < n; i++)   
{  
for (int j = i + 1; j < n; j++)   
{  
int tmp = 0;  
if (arr[i] < arr[j])   
{  
tmp = arr[i];  
arr[i] = arr[j];  
arr[j] = tmp;  
}  
}  
System.out.println(arr[i]);  
}   
}
else{
    System.out.println("please input value 1 or 2");
}
}  
}  
//or you can have following code also-:
/*
import java.util.Arrays;   
class prac12 
{   
public static void main(String[] args)   
{   
//defining an array of integer type   
int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
//invoking sort() method of the Arrays class  
Arrays.sort(array);   
System.out.println("Elements of array sorted in ascending order: ");  
//prints array using the for loop  
for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}  
*/
