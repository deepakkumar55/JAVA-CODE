import java.util.Scanner;

public class Q_1 {

    // Q 1. Positive or Negative number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:- ");
        int n = sc.nextInt();
        if (n > 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
