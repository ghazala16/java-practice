public class moving_in_sector_in_array {
    static long bestWorkers(int n, int k, int []a) {
        long maxSum = 0;
        long currentSum = 0;

        // Calculate initial sum for the first k workers
        for (int i = 0; i < k && i < n; i++) {
            currentSum += a[i];
        }

        maxSum = currentSum;

        // Calculate sums for subsequent groups of k workers
        for (int i = k; i < n; i++) {
            // Subtract the first worker from the previous group and add the next worker
            currentSum = currentSum - a[i - k] + a[i];//this step deletes the previous element of array and adds a new element in last position //if moving in a set of three then it will delete the 0th element and adds the 4th element
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
        }
}
