public class check_repeat_true {
    public static boolean checkForRepeats(int a[]){
    for(int i=0;i<5;i++)
    {
        for(int j=i+1;j<5;j++){
       /*  {
            boolean x= a[i]==a[j]?true:false;
            return x;
    }}}
    return x;*/
    if (a[i] == a[j]) {
        return true; // Found a repeat
    }
}
}
return false;
}
public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 6};

        if (checkForRepeats(a)) {
            System.out.println("True"); // If the array has repeats
        } else {
            System.out.println("False"); // If the array doesn't have repeats
        }
    }
}
