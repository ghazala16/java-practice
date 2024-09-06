import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class greedy_activity_selection_end_not_sorted {

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Create an array of pairs (start, end)
        int activities[][] = new int[start.length][2];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = start[i]; // Start time
            activities[i][1] = end[i];   // End time
        }

        // Sort activities by end time
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        // Initial activity selection
        maxAct = 1;
        ans.add(0);
        int lastEnd = activities[0][1]; // End time of first activity

        // Iterate through the remaining activities
        for (int i = 1; i < activities.length; i++) {
            if (activities[i][0] >= lastEnd) {  // If start time >= last end time
                maxAct++;
                ans.add(i);
                lastEnd = activities[i][1]; // Update last end time
            }
        }

        System.out.println("Maximum activities that can be performed = " + maxAct);
        System.out.println("Activities to be performed = " + ans);
    }
}
