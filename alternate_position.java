public class alternate_position {
    public class Solution {
        static int maxPlayersToMeet(int N, int M) {
            int maxPlayers = 0;
            int lastTeam = 0; // 0 for Netherlands, 1 for New Zealand
            
            while (N > 0 && M > 0) {
                // If the last team Ninja met was Netherlands
                if (lastTeam == 0) {
                    maxPlayers++;
                    N--;
                    lastTeam = 1; // Set lastTeam to New Zealand
                } else { // If the last team Ninja met was New Zealand
                    maxPlayers++;
                    M--;
                    lastTeam = 0; // Set lastTeam to Netherlands
                }
            }
            
            return maxPlayers;
        }
    
        public static void main(String[] args) {
            int[][] testCases = {
                {3, 4},
                {4, 4},
                {9, 5},
                {8, 8},
                {3, 5},
                {8, 3},
                {6, 7},
                {7, 7},
                {3, 3},
                {10, 7}
            };
    
            for (int[] testCase : testCases) {
                int maxPlayers = maxPlayersToMeet(testCase[0], testCase[1]);
                System.out.println("Maximum number of players Ninja can meet: " + maxPlayers);
            }
        }
    }
    
}
