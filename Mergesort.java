public class Mergesort {
 
    
    public static void main(String[] args) {

        int[] a = {13 ,12 ,5 ,18 ,34 ,63 ,29 ,34 ,98 ,76};
        int size =a.length;
        display(a, size);
        mergesort(a, 0, size-1);
        display(a, size);
        
    }
    static void display(int[] arr , int size){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] +"");

        }
        System.out.println();
    }

    static void mergesort(int[] arr , int left , int right){

        
            int mid;
            if(left < right)
            {
                // can also use mid = left + (right - left) / 2
                // this can avoid data type overflow
                mid = (left + right) / 2;
    
                // recursive calls to sort first half and second half sub-arrays
                mergesort(arr, left, mid);
                mergesort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }

   static void merge(int[] arr , int left , int mid , int right){

    int i,j,k;
    int n1 = mid -left+1;
    int n2 = right - mid ;

    int L[]=new int[n1];
    int R[]=new int[n2];
    
    for(i=0;i<n1;i++){
        L[i]=arr[left+i];
    }
    for (j = 0; j < n2; j++) {
        R[j]=arr[mid +1+j];    
    }

    i=0;
    j=0;
    k=left;

    while(i<n1 && j<n2){

        if(L[i]<R[j]){
            arr[k]=L[i];
            i++;
        }else{
            arr[k]=R[j];
            j++;
        }
        k++;
    }
    //Copy the remaining elements of of l[] if left out 
    while(i<n1){
        arr[k]=L[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k]=R[j];
        j++;
        k++;
    }

    
   }
        
}
