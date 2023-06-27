import java.util.Scanner;

public class Q_2_Leap_year {

    //Input a year and find whether it is a leap year or not.

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the year:-  ");
        int n=sc.nextInt();
        if(n/4==0){
            System.out.println("Its Leap Year:- "+n);
        }
        else{
            System.out.println("Its not Leap Year:- "+n);

        }

    }
}
