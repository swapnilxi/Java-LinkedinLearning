package io.github.swapnilxi;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5);
        multiple(2, 3, "apple", "ball");
        
    }

    private static void multiple(int i, int j, String ...s) {
        System.out.println(" "+ i + " "+ j+ " "+ Arrays.toString(s));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
}
