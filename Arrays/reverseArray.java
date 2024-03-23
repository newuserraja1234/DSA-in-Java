//Q. Reverse the array without using any duplicate array variable.

public class reverseArray {
    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12};
        int i;
        reverseArray(arr);
        // print the final value
        for(i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void reverseArray(int arr[]) {
        int  temp = 0, start = 0, end = arr.length-1;
        // for(int i=0; i<arr.length/2; i++) {
        //     temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }

        // +++++++ Better Approach ++++++++
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    } 
}