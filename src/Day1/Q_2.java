import java.util.Scanner;

public class Q_2 {
    // Q 2. Even or Odd number:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        int num=sc.nextInt();
        if (num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
