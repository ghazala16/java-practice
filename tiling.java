public class tiling {
    public static int tilingProblem(int n) // floor length
    {
        if(n==0||n==1)
        {
            return 1;
        }
        int fnm1=tilingProblem(n-1);
        int fnm2=tilingProblem(n-2);
        int totWays=fnm1+fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
}
