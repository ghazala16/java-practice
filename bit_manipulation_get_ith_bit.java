public class bit_manipulation_get_ith_bit {
    public static int bit_manipulation_get_ith_bit(int n)
    {
        int bitmask=1<<n;
        if((n&bitmask)==0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
        public static void main(String[] args)
        {
            System.out.println(bit_manipulation_get_ith_bit(102));
        }
}
