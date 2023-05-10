public class OrderAgnosticBS {
   
    // For sorted arrays either ascending or descending -
    public static void main(String[] args) {
        int[] arr1 = {23 ,45, 66 ,77, 88 ,93 , 102 , 245};
        int t = 234;
        int ans = OrderAgnosBS(arr1, t);
        System.out.println(ans);
        
    }
    static int OrderAgnosBS(int[] arr , int m){

        int start = 0;
        int end = arr.length - 1;

        Boolean isAsc = arr[start] < arr[end];

        while(start<=end){

            int mid = start + (end -start)/2 ;


        if (isAsc){
            
            if (m < arr[mid]){
                end = mid -1;
            }
            else if (m > arr[mid]){
                start = mid +1; 
            }
            else return mid; // ans found
        }else{
            if (m > arr[mid]){
                end = mid -1;
            }
            else if (m < arr[mid]){
                start = mid +1;  
        }
        else return mid;
    }
    
}
return -1;
    }

}



