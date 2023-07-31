import java.util.Scanner;

public class Q_8 {
    // Q 8. Java Program to Check Leap Year or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int yr = sc.nextInt();
        if(yr%4==0){
            System.out.println("It's Leep Year");
        }
        else{
            System.out.println("Not A leep Year.");
        }
    }
}
