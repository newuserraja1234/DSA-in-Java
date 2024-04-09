/*
Q. Write a program to take input of 4 * 4 in 2D array and print the boundaries of the matrix and calculate the sum of the inner element.
*/
import java.util.*;
public class boundary_innerSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][4]; 
        int i, j, inner_sum = 0;
        // Taking input from user
        System.out.println("Enter the elements: ");
        for(i=0; i<4; i++) {
            for(j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // printing the boundary of the matrix and calculating inner element sum
        for(i=0; i<4; i++) {
            for(j=0; j<4; j++) {
                if(i == 0 || j == 0 || i == 4-1 || j == 4-1)
                    System.out.print(arr[i][j] + " ");
                else {
                    System.out.print("  ");
                    inner_sum += arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum of the inner element = " + inner_sum);
    }
}