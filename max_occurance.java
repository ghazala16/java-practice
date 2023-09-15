/*public class max_occurance{
    public class MajorityElementFinder {
    public static int findMajorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2}; // Example input
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}
*/

public class max_occurance{
    public static int findMajorityElement(int[] nums) {
        return findMajorityElementRecursive(nums, 0, nums.length - 1);
    }
    
    private static int findMajorityElementRecursive(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        
        int mid = left + (right - left) / 2;
        
        int leftMajority = findMajorityElementRecursive(nums, left, mid);
        int rightMajority = findMajorityElementRecursive(nums, mid + 1, right);
        
        if (leftMajority == rightMajority) {
            return leftMajority;
        }
        
        int leftCount = countOccurrences(nums, leftMajority, left, right);
        int rightCount = countOccurrences(nums, rightMajority, left, right);
        
        return leftCount > rightCount ? leftMajority : rightMajority;
    }
    
    private static int countOccurrences(int[] nums, int target, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2}; // Example input
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}




