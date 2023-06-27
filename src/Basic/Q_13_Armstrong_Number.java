import java.util.Scanner;

public class Q_13_Armstrong_Number {



    //An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
    // It is also known as pluperfect, or Plus Perfect, or Narcissistic number.
    // It is an OEIS sequence A005188. Let’s understand it through an example.
    //
    //Armstrong Number Example
    //1: 1^1 = 1
    //
    //2: 2^1 = 2
    //
    //3: 3^1 = 3
    //
    //153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
    //
    //125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
    //
    //1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number , originalNumber, remainder, result = 0;
        number = sc.nextInt();
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

    }
}
