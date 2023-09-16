
//to return the largest and smallest number in an array 
import java.util.*;

public class solution3 {
    public static int max_min(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("smallest value in a array is"+" "+smallest);
        return largest;

    }

  

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 5, 3, 7, 4, 2 };

System.out.println("the largest value in array is"+" " +max_min(arr1));

System.out.println("the largest value in array is"+" " +max_min(arr2));


       

    }

}
