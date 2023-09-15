public class character_sequence {
    public static void main(String[] args) {
        int sequenceLength = 30; // Define how many characters you want to print
        int n = 1;

        for (int i = 1; i <= sequenceLength; i++) {
            String sequence = generateSequence(n);
            System.out.println("Index" + n + ":" + sequence);
            n++;
        }
    }

    public static String generateSequence(int n) {
        StringBuilder sequence = new StringBuilder();

        while (n > 0) {
            char ch = (char) ('A' + (n - 1) % 5);
            sequence.insert(0, ch);
            n = (n - 1) /5 ;//to break while loop
        }
        return sequence.toString();
    }
}