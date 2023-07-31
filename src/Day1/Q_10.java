import java.util.Scanner;

public class Q_10 {
    // Q 10. Java Program to print Prime numbers in a given range

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:- ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number:- ");
        int n2 = sc.nextInt();
        System.out.println("Prime numbers between " + n1 + " and " + n2 + " are:");
        printPrimeNumbersInRange(n1, n2);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printPrimeNumbersInRange(int n1, int n2) {
        for (int i=n1;i<=n2;i++){
            if (isPrime(i)) {
                System.out.print(i+" ");
                }
            }
            System.out.println();
    }
}
