import java.util.Scanner;

public class Q_7 {
    // Q 7. Find the Greatest Number Among Three Numbers in Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Second Number:- ");
        int num2 = sc.nextInt();
        System.out.print("Enter The third Number:- ");
        int num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest");
        }

        else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest");
        }

        else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is the greatest");
        }

    }
}
