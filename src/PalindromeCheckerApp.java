import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if(result)
            System.out.println("Result: It is a Palindrome");
        else
            System.out.println("Result: It is NOT a Palindrome");

        scanner.close();
    }
}


// Service Class
class PalindromeChecker {

    public boolean checkPalindrome(String str){

        int left = 0;
        int right = str.length() - 1;

        while(left < right){

            if(str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}