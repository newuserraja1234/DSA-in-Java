// Q. Find the index of the element using linear searching where arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20} and key = 5.

public class ArrayCC {
    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 2;
        int findElement = linearSearch(arr, key);
        if(findElement != -1) 
            System.out.println("Element is found at index = " + findElement);
        else
            System.out.println("Index is not found.");
    }
    
    public static int linearSearch(int a[], int key) {
        int i;
        for(i=0; i<a.length; i++) {
            if(a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}