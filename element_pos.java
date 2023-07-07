import java.util.Scanner;
class prac11
{
    public static void main(String[] args) 
    {
        int n, x, flag = 0, i = 0;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter no. of elements you want :");
        n = kb.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(i = 0; i < n; i++)
        {
            arr[i] = kb.nextInt();
        }
        System.out.print("Enter the element you want to find:");
        x = kb.nextInt();
        for(i = 0; i < n; i++)
        {
            if(arr[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}