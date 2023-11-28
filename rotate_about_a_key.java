public class rotate_about_a_key {
    public static void rotate_about_a_key(int arr[])
    {
        int key=4;
        for (int i = 0;i<(arr.length);i++)
        {
            if(arr[i]==key)
            {
                arr[0]=key;
                for(i=0;i<arr.length;i++)
                {
                    arr[i]=arr[key];
                    System.out.println(arr[i]);
                    
                }
            }

        }
    }
    public static void main(String args[])
    {
        int arr[]={0,1,2,3,4,5,6} ;
        rotate_about_a_key(arr);

       }
}
/*-------------------------------------------------------------------------------------------- */
/*
public class RotateAboutAKey {
    public static void rotateAboutAKey(int arr[]) {
        int key = 4;
        
        // Find the index of the key in the array
        int keyIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                keyIndex = i;
                break;
            }
        }
        
        if (keyIndex != -1) {
            int temp = arr[keyIndex];
            
            // Shift elements to the right
            for (int i = keyIndex; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            
            arr[0] = temp; // Move key to the first position
            
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Key not found in the array.");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 6, 4, 2, 5};
        
        rotateAboutAKey(arr);
    }
}



*/