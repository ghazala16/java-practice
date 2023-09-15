/*
class linear_search {

	static int search(int arr[], int n, int x)
	{
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int[] arr = { 3, 4, 1, 7, 5 };
		int n = arr.length;
		
		int x = 4;

		int index = search(arr, n, x);
		if (index == -1)
			System.out.println("Element is not present in the array");
		else
			System.out.println("Element found at position " + index);
	}
}
----------------------------------------------------------------------------------------------
*/

import java.util.Scanner;
public class linear_search
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        
        int key=s.nextInt();
        int flag=0;
        int a[]=new int[5];
        for(int i=0 ; i<=a.length-1 ;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0 ; i<=a.length-1 ;i++)
        {
            
            if(a[i]==key)
            {
                flag=0;
                System.out.println("found");
                break;
            }
            else{
                flag=1;
                System.out.println("not found");
                break;
                }
        }
    }
}