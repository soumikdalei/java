package com.company;
import java.util.Scanner;
public class cwh16_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int a= sc.nextInt();
        boolean cond=(a==18);
        if(cond){
            System.out.println("You are eligible to drive");

        }
        else{
            System.out.println("Fuck off");
        }
    }
}
