public class Beautiful_strings {
    public static int Beautiful_strings(int num,int lastIndex,String str)
    {
        
        if(lastIndex==0){
        Beautiful_strings(num-1,0, str+"0");
        Beautiful_strings(num-1,1, str+"1");
        }
        else{
            System.out.println(Beautiful_strings(num-1,0, str+"0"));
        }
        return lastIndex;
        


    }
    public static void main(String[] args) {
    Beautiful_strings(3, 0," ");
    }
    
}
