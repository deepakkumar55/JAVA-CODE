import java.util.Scanner;

public class Q_11_Palindrome_Program_2 {

    // A palindrome number is a number that is same after reverse.
    // For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
    // It can also be a string like LOL, MADAM etc.
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length(); 
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}


