// Q. Write a program to input the size and element of an array from user and print the all prime number from an array elements.

import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i, arr[];
        System.out.print("Enter the size of an array: ");
        n = sc.nextInt();
        arr = new int[n];
        // Taking input of element from user
        System.out.println("Enter the elements: ");
        for(i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // checking number is prime or not
        for(i = 0; i < n; i++) {
            if(check_prime(arr[i]) == 0)
                System.out.println("Prime Number = " + arr[i]);
        }
    }
    public static int check_prime(int n) {
        int i;
        if(n == 1) 
            return 1;

        for(i = 2; i < n; i++) {
            if(n % i == 0)
                return 1;
        }
        return 0;
    }
}
