import java.util.Scanner;

public class Q_7_Prime_Number {

    //Prime number is a number that is greater than 1 and divided by 1
    //  or itself only. In other words, prime numbers can't
    //  be divided by other numbers than itself or 1. For
    //  example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
