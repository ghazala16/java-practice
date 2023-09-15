public class sort_an_array_of_Strings {
    public static void mergeSort(String[] arr, int si, int ei) {
        if (si >= ei)
            return;

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);//left
        mergeSort(arr, mid + 1, ei);//right
        merge(arr, si, mid, ei);
    }

    public static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) // Compare strings using compareTo method
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= ei)
            temp[k++] = arr[j++];
        // Copy elements back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++)
            arr[i] = temp[k];
    }

    public static void main(String[] args) {
        String[] arr = {"jio", "airtel", "vodaphone", "bsnl"};
        mergeSort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
