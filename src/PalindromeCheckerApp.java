import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert string to char array
        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (left < right) {

            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome)
            System.out.println("Result: It is a Palindrome");
        else
            System.out.println("Result: It is NOT a Palindrome");

        scanner.close();
    }
}