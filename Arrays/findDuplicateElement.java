/*
Q. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input:nums = [1, 2, 3, 1]
Output:   true 

Example 2:
Input:nums = [1, 2, 3, 4]
Output:   false 

Example 3:
Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output:   true 

*/

import java.util.*;
public class ArrayCC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Initialized an array without size
        int arr[], size, i;
        // Taking input of array size
        System.out.print("Enter the size of the elments : ");
        size = sc.nextInt();
        arr = new int[size]; //-> assigning the size of an array
        // Taking input of elements from user
        System.out.println("Enter the elements: ");
        for(i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        // Calling the function
        if(findSameElement(arr, size))  
            System.out.println("True");
        else 
            System.out.println("False");
    }

    public static boolean findSameElement(int arr[], int size) {
        int i, j;
        for(i=0; i<size; i++) {
            for(j=i+1; j<size; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

// Time Complexity :-  Brute Force (O(n^2))