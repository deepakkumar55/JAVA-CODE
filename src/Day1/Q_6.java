import java.util.Scanner;

public class Q_6 {
    // Q 5. Java Program to Find Greatest of Two Numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number:- ");
        int n1 = sc.nextInt();
        System.out.print("Enter The Second Number:- ");
        int n2 = sc.nextInt();
        if(n1==n2){
            System.out.println("Both numbers are equal");
        }
        else if (n1 > n2) {
            System.out.println("The Greater number is " + n1 + "");
        } else {
            System.out.println("The Greater number is" + " " + n2 + "");
        }

    }
}
