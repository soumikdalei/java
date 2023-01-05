package com.company;
import java.util.Scanner;

public class cwh16_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int a=sc.nextInt();
        if(a>18){
            System.out.println("Boy You Can Drive");
        }
        else {
            System.out.println("Boy You Cant drive");
        }

    }
}
