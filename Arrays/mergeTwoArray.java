/*
Q. Write a program to store 6 elements in an array P and 4 elements in an array Q and now produce a third array
R, containing all the elements of array P and Q. Display the resultant array.
*/
import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int p[] = new int[6];
        int q[] = new int[4];
        int r[] = new int[10];
        int i, c = 0;
        // Taking input from user
        System.out.println("Enter the elements of P: ");
        for(i=0; i<6;  i++) {
            p[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of Q: ");
        for(i=0; i<4;  i++){
            q[i] = sc.nextInt();
        }
        // Store element of P in R
        System.out.println("Final Output :-");
        for(i=0; i<6; i++) {
            r[c++] = p[i];
        } 
        // Store element of Q in R
        for(i=0; i<4;  i++) {
            r[c++] = q[i];
        }
        // Final Output
        for(i=0; i<10; i++) {
            System.out.print(r[i] + " ");
        }
    }
}