public class RecursionBasics {
    public static void main(String[] args) {
        String message1="swapnil";
        message(message1);
        printNum(1);
    }
    static void message(String message){
        System.out.println("hello world");
        System.out.println(message);
    }
    static int printNum(int n){
        while(n<5){
        System.out.println(n);
        return printNum(n+1);
        }
        return n;
    }
}
