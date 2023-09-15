public class max_min_in_arr {
    public static void main(String[] args) {
        int arr[] = {11, 3, 9, 5, 6};
        int flag=0;
        int max=arr[0];                // Initialize max with the first element of the array
        
        for (int i = 1; i < arr.length; i++) 
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
        System.out.println("max is " + max);
    
}
}
