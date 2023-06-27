import java.util.Scanner;

public class Q_6_Area_Of_Circle_Java_Program {

    //Java program to calculate or to print area of a circle in a simple method
    // A = π*r*r
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:- ");
        double r= sc.nextDouble();
        double  area=(22*r*r)/7 ;
        System.out.println("Area of Circle is: " + area);
    }
}
