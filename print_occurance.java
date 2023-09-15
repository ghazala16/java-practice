/*public class print_occurance {
    public static void print_all_occurance(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,2,2,25,6};
        print_all_occurance(arr, 2);
        }
    }

*/

public class print_occurance {
    public static int print_all_occurance(int arr[],int key,int i)
    {
        if(i==arr.length)
        return -1;
        
        if(arr[i]==key)
        
        System.out.print(" "+i+" ");
        return print_all_occurance(arr, key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,2,2,25,6};
        print_all_occurance(arr, 2,0);
    }
}

