
import java.util.Scanner;
class take_array_by_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
String temp = Integer.toString(number);

int[] num = new int[temp.length()];

for (int i = 0; i < temp.length(); i++){
    num[i] = temp.charAt(i) - '0';
}

for (int i = 0; i < temp.length(); i++) {
    System.out.println(num[i]);
}
    }
}