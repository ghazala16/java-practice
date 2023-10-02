public class reverse {
        public static void main(String[] args) {
        int arr[] = {211, 3, 4, 5, 6};

        // Reverse the array in-place
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];//code will move  right to left
            arr[arr.length - i - 1] = temp;
        }

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
