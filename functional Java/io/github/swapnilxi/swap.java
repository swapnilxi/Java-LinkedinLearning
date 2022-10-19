package io.github.swapnilxi;

public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        swapnum(a,b);
    }

    private static void swapnum(int num1, int num2) {
        int temp= num1;
         num1= num2;
         num2= temp;
         System.out.println("a:" + num1+" b:"+ num2);

    }


    
}