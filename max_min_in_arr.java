/*public class max_min_in_arr {
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
*/
import java.util.Arrays;

class Pair {
	public int min;
	public int max;
}

class Main {
	static Pair getMinMax(int arr[], int n) {
		Pair minmax = new Pair();
		Arrays.sort(arr);
		minmax.min = arr[0];
		minmax.max = arr[n - 1];
		return minmax;
	}

	public static void main(String[] args) {
		int arr[] = { 1000, 11, 445, 1, 330, 3000 };
		int arr_size = arr.length;
		Pair minmax = getMinMax(arr, arr_size);
		System.out.println("Minimum element is " + minmax.min);
		System.out.println("Maximum element is " + minmax.max);
	}
}
