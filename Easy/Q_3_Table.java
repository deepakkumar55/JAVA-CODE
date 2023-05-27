import java.util.Scanner;
public class Q_3_Table {

    //Take a number as input and print the multiplication table for it.

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter The Number:-  ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n +" * "+i+" = "+n*i);
        }
    }
}
