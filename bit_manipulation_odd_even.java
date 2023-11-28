public class bit_manipulation_odd_even {
    public static void oddOreven(int n)
    {
        int bitmask=1;
        if((n&bitmask)==0)
        {
            //even no
            System.out.println("even no");
        }
        else{
            System.out.println("odd no");
        }
    }
    public static void main(String[] args) {
        oddOreven(3);
        oddOreven(11);
        oddOreven(14);
    }
}
