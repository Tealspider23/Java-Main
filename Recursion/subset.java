import java.util.ArrayList;
import java.util.List;

public class subset {
    
    public static void main(String[] args) {
        
    }



    static List<List<Integer>> Subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        return outer;

        for (int i = 0; i < arr.length; i++) {
  
            // accessing each element of array
            int x = arr[i];{
            int n =outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> internal=new ArrayList<>();
                internal.add(x);
                outer.add(internal);
                
            }
        }
    return outer;



    }
}
}



