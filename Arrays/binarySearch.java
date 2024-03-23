// Q. Write a program to find the key from a given array using binary search i.e arr[] = {2, 4, 6, 8, 10, 12, 14} and key = 10. (Note:- prerequistes :- array must be sorted.)

public class binarySearch {
    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 2;
        int value = binarySearch(arr, key);
        if(value != -1) {
            System.out.println("Key is found at index = " + value);
        }
        else {
            System.out.println("Index is not found.");
        }
    }

    public static int binarySearch(int arr[], int key) {
        int start=0, end=0, mid=0, l=0;
        l = arr.length;
        end = l-1;
        while(start <= end) {
            mid = (start + end) / 2;
            //comparisons
            if(arr[mid] == key) 
                return mid;

            else if(arr[mid] < key)  //right
                start++; // OR -> start = mid + 1;

            else if(arr[mid] > key) //left
                end--; // OR -> end = mid -1;
        }
        return -1;
    }
}