package subsequence;
public class permutations {
    public static void main(String[] args) {
        permutation("", "abc");
    }
    static void permutation(String p, String unp){
        if(unp.isEmpty()){
        System.out.println(p);
            return;
        }
        char ch=unp.charAt(0);
        for(int i=0; i<p.length(); ++i){
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
            permutation(f+ch+s, unp.substring(1));
        }
    }
}
