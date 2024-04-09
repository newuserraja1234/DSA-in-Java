/*
Q. Write a program to take input in an 2D array and calculate the following:-
i. Sum of left diagonal.
ii. Sum of right diagonal.
iii. Sum of the matrix.
*/
import java.util.*;
public class matrix_sums {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][], size, i, j, leftDiagonal = 0, rightDiagonal = 0, matrixSum = 0;
        // Taking the input of the size of an array from user
        System.out.print("Enter the size: ");
        size = sc.nextInt();
        //assigned the size of 2d array
        arr = new int[size][size];
        System.out.println("Enter the elements: ");
        for(i=0; i<size; i++) {
            for(j=0; j<size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(i=0; i<size; i++) {
            for(j=0; j<size; j++) {
                // left diagonal calculation
                if((i+j) == size-1)
                    leftDiagonal += arr[i][j];
                // right diagonal calculation
                if(i == j)
                    rightDiagonal += arr[i][j];
                // matrix sum calculation
                matrixSum += arr[i][j];
            }
        }
        System.out.println("Sum of left diagonal = " + leftDiagonal);
        System.out.println("Sum of right diagonal = " + rightDiagonal);
        System.out.println("Sum of the matrix = " + matrixSum);
    }
}