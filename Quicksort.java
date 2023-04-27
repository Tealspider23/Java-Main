import java.util.Arrays;

public class Quicksort {
 
    
    public static void main(String[] args) {
        int[] arr = { 23 , 34 ,12 ,56 ,67 , 7 , 13 ,98};
        System.out.println(Arrays.toString(arr));
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        
    }

    static void quicksort(int[] arr , int low , int high){

        if (low>=high){
            return;
        }
        int s =low;
        int e =high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while(s<=e){
            // also a reason when array is sorted it doesnt swap
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }

            if (s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        // now the pivot is at correct index , sort the two halves
        quicksort(arr, low ,e);
        quicksort(arr ,s , high);


    }
}
