package com.company;
import java.util.Scanner;

public class cwh16_2 {
    public static void main(String[] args) {


        Scanner src = new Scanner(System.in);
        System.out.println("Enter age");
        int a = src.nextInt();
        if(a!=18){
            System.out.println("You are eligible to drive");
        }

    }
}