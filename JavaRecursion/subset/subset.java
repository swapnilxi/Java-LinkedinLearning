package subset;

public class subset {
    // program to remove character a from string
    public static void main(String[] args) {
        String s = "abbaccabb";
        String s2="abbappleccb";
        // String unprocessed = s;// string with 'a'
        // String processed = skip(unprocessed);
        // System.out.println(processed);
        // String processed2=" ";//new intially empty variable
        // skip2(processed2, unprocessed);
        System.out.println(skipAppNotApple(s2));
        
    }
    static String skipAppNotApple(String unp){
        if(unp.isEmpty()){
             return "";
            };
        if(unp.startsWith("app")&& !unp.startsWith("apple")){
            return skipAppNotApple(unp.substring(3));
    }else{
        return unp.charAt(0)+skipAppNotApple(unp.substring(1));
    }
}
    static void skip2(String p2, String unp) {
   
       if (unp.isEmpty())
       { 
        System.out.println(p2);
        return;
    }
    char ch= unp.charAt(0); 
        if(ch=='a'){
         skip2(p2, unp.substring(1));
        }else{
        skip2( p2+ch, unp.substring(1));
        }
    }

    static String skip(String unp) {
        if (unp.isEmpty()) {
            return "";
        }
        char ch = unp.charAt(0);
        if (ch == 'a') {
            return skip(unp.substring(1));// creating substring from index 1
            // this will exculde a at index 0 every time new unp encounter
        } else {
            return ch+ skip(unp.substring(1));

        }
    }

}
