public class remove_duplicate {
    public static void removeDuplicate(String str, int index, StringBuilder newStr, boolean map[]) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        
        char currChar = str.charAt(index);
        if (!map[currChar - 'a']) {
            map[currChar - 'a'] = true;
            newStr.append(currChar); // Add the character to newStr
            removeDuplicate(str, index + 1, newStr, map);
            newStr.deleteCharAt(newStr.length() - 1); // Remove the added character to backtrack
        }
        
        removeDuplicate(str, index + 1, newStr, map);
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        System.out.println("Original String: " + str);
        System.out.println("After Removing Duplicates:");
        removeDuplicate(str, 0, new StringBuilder(), new boolean[26]);
    }
}
