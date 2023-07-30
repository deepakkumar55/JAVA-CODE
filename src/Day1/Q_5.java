import java.util.Scanner;

public class Q_5 {
    // Q 5. Find the Sum of the Numbers in a Given Range in Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number:- ");
        int n1 = sc.nextInt();
        System.out.print("Enter End number :- ");
        int n2 = sc.nextInt();
        int sum=0;
        for (int i = n1; i <=n2; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
