package io.github.swapnilxi;

import java.util.Scanner;

public class function {
    static void sum(){
       
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number 1:");
    int a=sc.nextInt();

    System.out.println("enter the number 2: ");
    int b= sc.nextInt();

  
    int sum = a+ b;
    System.out.println("the sum is :"+ sum);
}

    
public static void main(String[] args) {
    System.out.println("this is functional programming");
 sum();
    
}
}