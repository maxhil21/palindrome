import java.util.Scanner;

public class palindrome { // class declaration
    boolean isPalindrome(String str) {  // function declaration
        //variable declaration
        int n = str.length();
        int i = 0, j = n - 1;
        //begin the loop
        while (i < j) {
            //set conditionals
            if (str.charAt(i) != str.charAt(j)) { // check if the current left char is equal to the current right char
                //failure message
                System.out.println("is not a palindrome");
                return false;
            }
            //increment variables to continue
            i++;
            j--;
        }
        //success message
        System.out.println("is palindrome");
        return true;
    }
    //example function to be tested
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a word to check");
        String input = scanner.nextLine();
        palindrome p = new palindrome();
        p.isPalindrome(input);
        scanner.close();
    } 
}