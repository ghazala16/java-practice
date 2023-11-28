public class Balls_in_Box {
    static int boxFilling(int n, int x, int y) {
        // Write your code here.
        int res=n*x;
        int fullyFilledBoxes = res / y; // Number of fully filled boxes

        // If there are remaining items after filling complete boxes, add an extra box
        int finall = (res % y > 0) ? fullyFilledBoxes + 1 : fullyFilledBoxes;

        return finall;
    }
    public static void main(String[] args) {
        int n = 10; // Example number of items
        int x = 5;  // Example box capacity
        int y = 3;  // Example maximum items per box

        int result = boxFilling(n, x, y);
        System.out.println("Number of boxes needed: " + result);
    }
}

