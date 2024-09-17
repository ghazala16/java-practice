public class run_rate_lift {
        static int minOversToReachRunRate(int D) {
            int overs = 0;
            int runsScored = 0;
    
            while (runsScored < D) {
                // Calculate runs scored in the next over if Explosive Hitter is sent
                int runsWithExplosiveHitter = runsScored + 3;
                
                // Calculate runs scored in the next over if Steady Accumulator is sent
                int runsWithSteadyAccumulator = runsScored + 2;
                
                // Determine which type of batsman to send in the next over
                if (runsWithSteadyAccumulator <= D && runsWithSteadyAccumulator >= runsWithExplosiveHitter) {
                    // Send in Steady Accumulator if it won't exceed D and is better than Explosive Hitter
                    runsScored = runsWithSteadyAccumulator;
                } else if (runsWithExplosiveHitter <= D) {
                    // Send in Explosive Hitter if run rate can be increased without exceeding D
                    runsScored = runsWithExplosiveHitter;
                } else {
                    // If neither batsman can increase the run rate further, break the loop
                    break;
                }
                
                overs++;
            }
    
            return overs;
        }
    
        public static void main(String[] args) {
            int[] requiredRunRates = { 25, 30 };
    
            for (int D : requiredRunRates) {
                int oversNeeded = minOversToReachRunRate(D);
                System.out.println("Minimum number of overs needed for run rate " + D + ": " + oversNeeded);
            }
        }
    }
    

