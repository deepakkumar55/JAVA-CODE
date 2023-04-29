import java.util.Scanner;

public class Q_10_Palindrome_Program {

    // A palindrome number is a number that is same after reverse.
    // For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
    // It can also be a string like LOL, MADAM etc.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,sum=0,temp;
        System.out.print("Enter the number:- ");
        int n=sc.nextInt();

        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

}
