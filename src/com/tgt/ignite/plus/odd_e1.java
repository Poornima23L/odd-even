package com.tgt.ignite.plus;

import java.util.Scanner;

public class odd_e1 {
    public static void main(String [] args){
        int num;
        Scanner read = new Scanner(System.in);
        System.out.println("enter a number:");
        num = read.nextInt();
        if(num%2==0){
            System.out.println("it is even number");
        }
        else{
            System.out.println("it is odd number");
        }
    }
}
