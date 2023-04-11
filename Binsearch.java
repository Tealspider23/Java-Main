import java.util.Scanner;

public class Binsearch {
    
    public static void main(String[] args) {
        int[] arr = { 2 , 4, 5 ,13, 34,45 ,64, 72};
        System.out.println("Enter the element you want to search for :");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr , int t ){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            //find the middle element
            // int mind = (start + end) / 2
            // sometimes it gives problem when mid exceeds the range of int in java
            int mid = start + (end -start)/2 ;

            if (t < arr[mid]){
                end = mid -1;
            }
            else if (t > arr[mid]){
                start = mid +1; 
            }
            else return mid; // ans found


        }
    return -1;
    }
}
