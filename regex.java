import java.util.Scanner;

public class regex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String ip = s.next();
            System.out.println(ip.matches(MyRegex.IP_PATTERN));
        }
    }


class MyRegex {
    static String IP_0TO255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4][0-9]|25[0-5])";
    static String IP_PATTERN = IP_0TO255 + "\\." + IP_0TO255 + "\\." + IP_0TO255 + "\\." + IP_0TO255;
}
}

