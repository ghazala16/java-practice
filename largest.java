public class largest {
    public static String findLargest(String str1, String str2) {
        if (str1.compareTo(str2) > 0) {
            return str1;
        } else {
            return str2;
        }
    }
    
    public static void main(String[] args) {
        String fruits[] = {"zaaleeee", "zmango", "zbanana"};
        String largest = fruits[0]; // Initialize largest with the first fruit
        for (int i = 1; i < fruits.length; i++) {  //fruits.length=3 as 3 fruits are there
            System.out.println(fruits.length);
            largest = findLargest(largest, fruits[i]);
        }
        System.out.println("The largest fruit is: " + largest);
        //System.out.println(fruits[1]);
    }
}

