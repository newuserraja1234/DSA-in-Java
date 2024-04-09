import java.util.*;
public class larg_and_small {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int i, j;
        // Taking input from user
        System.out.println("Enter the elements: ");
        for(i=0; i<matrix.length; i++) {
            for(j=0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        smallestAndLargestValue(matrix);
    }
    public static void smallestAndLargestValue(int [][]arr) {
        int i, j, small = Integer.MAX_VALUE, larg = Integer.MIN_VALUE;
        for(i=0; i<arr.length; i++) {
            for(j=0; j<arr[0].length; j++) {
                if(arr[i][j] > larg) 
                    larg = arr[i][j];
                if(arr[i][j] < small)
                    small = arr[i][j];
            }
        }
        System.out.println("Largest Element = " + larg);
        System.out.println("Smallest Element = " + small);
    }
}