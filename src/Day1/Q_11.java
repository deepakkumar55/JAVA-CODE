import java.util.Scanner;

public class Q_11 {
    // Q 11. Sum of digits of a Number in Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.println ("Sum of digits : " + sum);
    }
}
