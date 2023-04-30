import java.util.ArrayList;

public class Subseq {
    
    public static void main(String[] args) {
       // subseqAscii("","abc");
        System.out.println(subseqtAscii("","abc"));
    }

    static void subseq(String p , String up){
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p, up.substring(1));

    }

    static ArrayList<String> subseqt(String p , String up){
        if(up.isEmpty())
        {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseqt(p+ch,up.substring(1));
        ArrayList<String> right =subseqt(p, up.substring(1));
       left.addAll(right);
       return left;
    }

    static void subseqAscii(String p , String up){
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p+(ch+0), up.substring(1));

    }
    
    static ArrayList<String> subseqtAscii(String p , String up){
        if(up.isEmpty())
        {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = subseqtAscii(p+ch,up.substring(1));
        ArrayList<String> second=subseqtAscii(p, up.substring(1));
        ArrayList<String> third =subseqtAscii(p+(ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
       return first;
    }
}
