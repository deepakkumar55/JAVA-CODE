package Array;

// Java Program for finding the largest element of the array

public class Q_1 {
    public static void main(String[] args) {
        int arr[] = {112, 13, 1, 10, 34, 10};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("Largent number in the array is the :- "+ max);
    }
}
