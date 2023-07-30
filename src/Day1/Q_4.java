import java.util.Scanner;

public class Q_4 {
    // Q 4. Sum of First N Natural numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        int num = sc.nextInt();
        int sum=0;
        for (int i = 1; i <= num; i++) {
            sum+=i;
            System.out.print(sum +" ");
        }
        System.out.println(sum);
    }
}
