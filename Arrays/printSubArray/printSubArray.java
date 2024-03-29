/* 
Print subarray of an element.
Prerequisite -> array element must be sorted.
Ex :-
Input :- arr[] = {2, 4, 6, 8, 10}
Output :-
2 
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10 

4 
4 6 
4 6 8 
4 6 8 10

6
6 8
6 8 10

8
8 10

10
*/
public class printSubArray {
    public static void printSubArray(int number[]) {
        int i, j, k, ts = 0;
        for(i=0; i<number.length; i++) {
            for(j=i; j<number.length; j++) {
                for(k=i; k<=j; k++) {
                    System.out.print(number[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + ts);
    }
    public static void main(String args[])  {
        int arr[] = {2, 4, 6, 8, 10};
        printSubArray(arr);
    }
}