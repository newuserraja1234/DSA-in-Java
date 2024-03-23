/*
Pairs in an Arrays :-
Input :- arr[] = {2, 4, 6, 8, 10}
Output:- 
        (2, 4), (2, 6), (2, 8), (2, 10)
        (4, 6), (4, 8), (4, 10)
        (6, 8), (6, 10)
        (8, 10)
*/
public class ArrayCC {
    public static void main(String args[]) {
        int arr[]  =  {2, 4, 6, 8, 10};
        pairInArray(arr);
    }
    public static void pairInArray(int []a) {
        int i, j;
        for(i=0; i<a.length; i++) {
            for(j=i+1; j<a.length; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ")" + " ");
            }
            System.out.println();
        }
    }
}