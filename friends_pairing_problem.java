public class friends_pairing_problem {
    public static int friendsPairing(int n)
    {
        if(n==1|| n==2)
        return n;
        int fnm1=friendsPairing(n-1);
        int fnm2=friendsPairing(n-2);
        int pairways=(n-1)*fnm2;
        // total ways
        int totWays=fnm1+pairways;
        return totWays;
    }
    public static void main(String[] args) {
        friendsPairing(3);
    }
    
}
