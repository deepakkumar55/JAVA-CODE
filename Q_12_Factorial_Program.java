import java.util.Scanner;

public class Q_12_Factorial_Program {

    // Factorial Program in Java: Factorial of n is the product of all positive descending integers.
    // Factorial of n is denoted by n!.
    // For example:
    //      4! = 4*3*2*1 = 24
    //      5! = 5*4*3*2*1 = 120

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,fact=1;
        System.out.print("Enter the number:- ");
        int number=sc.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
