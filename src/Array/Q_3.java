package Array;

// Java Program for Finding the Smallest and largest element in an array

public class Q_3 {
    public static void main(String[] args) {
        int arr[] = {112, 13, 1, 10, 34, 10};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("Largest number in the array is the :- "+ max);
        for (int i = 0; i < arr.length; i++) {
            if (max>arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("Smallest number in the array is the :- "+ max);
    }
}
