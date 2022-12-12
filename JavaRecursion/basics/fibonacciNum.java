package basics;
public class fibonacciNum {
    public static void main(String[] args) {
        fibo(6);
       // System.out.println(fibo(6));
        
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        System.out.println(fibo(n-1)+ fibo(n-2));
        return fibo(n-1)+ fibo(n-2);
    }
}
