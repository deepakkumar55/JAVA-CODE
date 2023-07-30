import java.util.Scanner;

public class Q_3 {
    // Q 3. Sum of N natural numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sum of N natural numbers:- ");
        int num = sc.nextInt();
        int sum= 0;
        for (int i = 0; i <=num; i++) {
            sum+=i;
        }System.out.println(sum);


    }
}
