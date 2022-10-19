package io.github.swapnilxi;

// if cube of individual digit gives the same number 
 
public class Amstrongnum{
    public static void main(String[] args) {
        int n=153;
        System.out.println( isAmstrongNum(n)); 
    }

    static boolean isAmstrongNum(int n ){
        int orignal=  n;
        int sum=0;
        
        while(n>0){
            int rem=n%10;
            n= n/10;
            sum=sum+ rem*rem*rem;
        }

     return sum==orignal;
    }
}