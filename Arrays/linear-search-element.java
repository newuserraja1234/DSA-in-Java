//Q. Write a program to input size and element of an rollno[] and marks[] in an array from user and also input the searching 'rollno' and find the rollno in an rollno[] by using linear searching if rollno is found then print also the marks of it.


import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rollno[], marks[], i, n, search_rollno, p = -1;
        System.out.print("Enter the size of an array: ");
        n = sc.nextInt();
        rollno = new int[n];
        marks = new int[n];
        // Taking input rollno and marks from user
        System.out.println("Enter rollno and marks space in between: ");
        for(i = 0; i < n; i++) {
            rollno[i] = sc.nextInt();
            marks[i] = sc.nextInt();
        }
        // Taking input of searching rollno
        System.out.println("Enter searching roll no: ");
        search_rollno = sc.nextInt();
        // searching the rollno using linearSearch technique
        p = linearsearch(rollno, marks, search_rollno, n);
        if(p != 1)  {
            System.out.println("Index of rollno = " + p);
            System.out.println("Marks of " + rollno[p] + " = " + marks[p]);
        }  
    }
    public static int linearsearch(int[] r, int[] m, int sv, int n) {
        int i;
        for(i = 0; i < n; i++) {
            if(r[i] == sv)
                return i;
        }
        return -1;
    }
}
