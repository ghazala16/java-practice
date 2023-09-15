
public class last_occurence_of_an_element{
    public static int lastOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1; // Key not found in the array
        }
        
        if (arr[i] == key) {
            return i; // Return the index of the last occurrence
        }
        
        return lastOccurrence(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 6};
        int key = 5; // The key you want to find
        System.out.println(lastOccurrence(arr, key, arr.length - 1));
    }
}


