import java.util.Scanner;

public class Linearsearch {

    public static void main(String[] args) {
        int[] arr = { 23 ,45 , 64 , 41 , 10 , 12 , 9};
        for (int num:arr){
            System.out.println(num +" ");
        }
        
        System.out.println("Enter the number you want to search for :");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int ans = Linearsearch(arr, t);
        System.out.println(ans);
        
    }
    static int Linearsearch(int[] arr, int target )
    {
        if(arr.length==0){
            return -1;
        }
        for (int index=0;index<arr.length;index++){
            //check for element at every index
            int element = arr[index];
            if (element == target){
            return index;
                }
        
        }
        return -1;
    }

    //for searching in a range just specify the index from the start
    // and end position
    // for minimum and maximum 
    // apply this min = arr[0]
    // if arr[i] < 
    
}
