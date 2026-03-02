import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check (UC3 & UC4): ");
        String original = sc.nextLine();

        // ===== UC3: Reverse string =====
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("[UC3] \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("[UC3] \"" + original + "\" is not a palindrome.");
        }

        // ===== UC4: Ignore case & spaces =====
        String cleaned = original.replaceAll("\\s+", "").toLowerCase();
        String reversedCleaned = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversedCleaned += cleaned.charAt(i);
        }

        if (cleaned.equals(reversedCleaned)) {
            System.out.println("[UC4] \"" + original + "\" is a palindrome ignoring case and spaces.");
        } else {
            System.out.println("[UC4] \"" + original + "\" is not a palindrome ignoring case and spaces.");
        }

        sc.close();
    }
}
