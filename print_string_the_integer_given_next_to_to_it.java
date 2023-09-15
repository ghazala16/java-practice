public class print_string_the_integer_given_next_to_to_it {
    public static void main(String[] args)
    {
        String a="a2b4c3";
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<a.length()-1;i=i+2)
        {
            int value=Integer.parseInt(String.valueOf(a.charAt(i+1)));
            for (int j=0;j<value;j++){
                stringBuilder.append(a.charAt(i));
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
