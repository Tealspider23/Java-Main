public class dice {
    
    public static void main(String[] args) {
        dicecomb("",4);
    }
    static void dicecomb(String p , int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target; i++) {
            dicecomb(p+i,target-i);


            
        }

    }
}
