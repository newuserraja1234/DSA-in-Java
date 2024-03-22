//  Q. Find the largest element in the given array i.e arr[] = {1, 2, 6, 3, 5}

import java.util.*;
public class ArrayCC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[], i, size;
        System.out.print("Enter the size of an elements: ");
        size = sc.nextInt();
        arr = new int[size];
        // Taking input from user
        System.out.println("Enter the element of an array : ");
        for(i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest Element = " + findLargestElement(arr, size));
    }

    public static int findLargestElement(int []a, int size) {
        int i, larg = Integer.MIN_VALUE; // -> -infiinity
        // small = Integer.MAX_VALUE; -> +infinity
        for(i=0; i<size; i++) {
            if(larg < a[i]) 
                larg = a[i];
        }
        return larg;
    }
}