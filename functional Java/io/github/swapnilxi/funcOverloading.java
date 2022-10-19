package io.github.swapnilxi;

public class funcOverloading {
    public static void main(String[] args) {
        fun(2,3);
        fun(7);
    }
    static void fun(int a , int b){
    System.out.println(a);
    System.out.println(b);
    }
    //overloading 

   static void fun(int b){
    System.out.println(b);

    }
    
}
