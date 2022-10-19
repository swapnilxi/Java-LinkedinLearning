package io.github.swapnilxi;

public class shadowing {
    static int x;
    public static void main(String[] args) {
        System.out.println(x=5);
        int x=40;//shadowing
        System.out.println(x);
        //the variable will higher level scope is shadowed 
        fun();
    }

    static void fun(){
        System.out.println(x=10);
    }

    
}
