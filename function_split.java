import java.util.Scanner;
public class function_split {



    
    
        public static void main(String[] args)
         {
           /*  Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            scan.close();
        
            // Split the string into tokens based on the given regular expression
            String[] tokens = s.split("[^A-Za-z !,?._'@]+");
            System.out.println(tokens.length);
            
            // Print each token in the array
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
    */
    



    
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            scan.close();
        
            // Split the string into tokens using the regular expression pattern and comma as delimiters
            String[] tokens = s.split("[A-Za-z !,?._'@]+|,");
            System.out.println(tokens.length);
            
            // Print each token in the array
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
    





   
       /*Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
    
        
        // Split the string into words and store them in an array
        String[] words = splitt(s);
        System.out.println(words.length);
        
        // Print each word in the array
        for (String word : words) {
            
            System.out.println(word);
        }
    }
    
    public static String[] splitt(String s) {
        // Split the string into words using space as the delimiter
        String[] words = s.split(" ");
        //words=s.split(",");
        return words;
    }
}
*/