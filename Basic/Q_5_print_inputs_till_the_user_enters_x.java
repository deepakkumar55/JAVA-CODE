import java.util.Scanner;

public class Q_5_print_inputs_till_the_user_enters_x {

    //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (or 'x' to exit):- ");
        while (true) {
            String input = scan.nextLine();
            if (input.equals("x")) {
                break;
            }
            int num = Integer.parseInt(input);
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
