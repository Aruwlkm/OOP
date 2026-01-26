package practice1;
import java.util.Scanner;
public class Problem6 {
    public static boolean isPalindrome(String s) {
        String word = new StringBuilder(s).reverse().toString();
        return s.equals(word);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome emes");
        }
    }
}