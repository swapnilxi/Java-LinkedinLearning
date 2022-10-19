package io.github.swapnilxi;

import java.util.Scanner;

public class personalisedmes {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your name: ");
    String name= sc.nextLine();
    String Greet = GreetingName(name);  
    System.out.println(Greet);  
    sc.close();
    }

    private static String GreetingName(String name) {
        return greet()+name;
    }

    private static String greet() {
        return "hello ";
    }

    
}