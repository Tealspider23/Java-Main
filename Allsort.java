public class Allsort {
   public static void main(String[] args) {
    int[] arr = {2 ,4 ,6 ,1 ,3 ,5 };
    insertionsort(arr);
    for (int i = 0;i<arr.length;i++)
    System.out.println(arr[i]);
    
   }
   static void insertionsort(int[] arr ){
    for (int i = 0; i <= arr.length-2; i++) {
        for (int j = i+1; j >0; j--) {
            if (arr[j]<arr[j-1]){
                swap(arr, j, j-1);
            }else{
                break;

            }
            
        }

        
    }
   } 
   static void sort(int[] arr){
    int i =0;
    while(i<arr.length){
        int correct=arr[i]-1;
        if (arr[i]!=arr[correct]){
            swap(arr,i,correct);

        }else{
            i++;
        }
    }
   }

   static void selectionsort(int[] arr ){
    for (int i = 0; i < arr.length; i++) {
        //Find the maximum item in the array and swap with correct index
        int last = arr.length-i-1;
        int maxindex = getMax( arr , 0 ,last);
        swap(arr,maxindex,last);
        
    }
   }

   static void swap(int[] arr , int first , int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
   }

   static int getMax(int[] arr , int start, int end) {
    int max = start;
    for (int j = start; j <=end; j++) {
        if(arr[max] < arr[j]){
            max = j;
        }
        
    }
    return max;
}

static void bubblesort(int[] arr ){
    boolean swapped;
    //run the steps n-1 times
    for(int i = 0 ; i < arr.length;i++){
        swapped = false;

        //for each step , last item will come at the last index

        for(int j =1;j<=arr.length-1-i;j++ ){
            //swap id the item is smaller than the previous item
            if (arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                swapped = true;
            }
        }
     // if you didnt swap for a particular value of i then the array is sorted.
     if(!swapped){
        break; // !false should give true
     }
    }
   }
}
// the meaning of the last swapped is that it will not go for other value of i if it returns the value of false to the if(!swapped) statement.
