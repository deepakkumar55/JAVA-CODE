package Array;

// JAVA Program for calculating the sum of all the elements of an array

public class Q_4 {
    public static void main(String[] args) {
        int arr[] = {112, 13, 1, 10, 34, 10};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
