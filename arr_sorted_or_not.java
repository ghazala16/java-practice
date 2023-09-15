public class arr_sorted_or_not {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {//this is the base case so it should be above?
            return true; // Array is sorted up to this point
        }
        if (arr[i] > arr[i + 1]) {
            return false; // Not sorted
        }
        return isSorted(arr, i + 1); // Continue checking the rest of the array
    }

    public static void main(String[] args) {
        int arr[] = {19 ,2, 3, 4};
        System.out.println(isSorted(arr, 0));
    }
}